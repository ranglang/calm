#!/usr/bin/python
# -*- coding: utf-8 -*-

import akshare as ak
import pandas as pd
import matplotlib.pyplot as plt
import mplfinance as mpf
import numpy as np
# if using a Jupyter notebook, include:
code = 'sh600582'

def get_var1(df, idx, get_up):
    item = df.index.values[idx]
    current_close=df.at[item, 'close']
    if(isinstance(current_close, np.ndarray)):
        current_close=current_close[0]
    var1=0
    if(idx > 0):
        previous_close=df.at[df.index.values[idx -1], 'close']
        if(isinstance(current_close, np.ndarray)):
            previous_close=previous_close[0]
        if(current_close > previous_close):
            if(get_up is True):
                var1=df.at[item, 'volume']
            else:
                var1=0
        else:
            if(get_up is False):
                var1=df.at[item, 'volume']
            else:
                var1=0
    else:
        current_close=0
        var1=0
    return var1

def get_chaodie_by_akshare(code, x_count, is_week= False, save_image= True, gap=18):
    print("get_chaodie_by_akshare %s" % code)
    title = ""
    if(is_week is True):
        title=" %s week" % code
    else:
        title=" %s day" % code
    if (is_week is False):
        daily = ak.stock_zh_a_daily(symbol=code, adjust="hfq")[-200:].dropna()
    else:
        daily = ak.stock_zh_a_daily(symbol=code, adjust="hfq")[-200:].resample('W', label='left').last().dropna()
    count = len(list(daily.index.values))
    var1 = list(map(lambda x: get_var1(daily, x, True), list(range(count))))
    sa_var1 = pd.Series(var1, index=daily.index.values)
    var2 = list(map(lambda x: get_var1(daily, x, False), list(range(count))))
    sa_var2 = pd.Series(var2, index=daily.index.values)
    daily['up'] = sa_var1
    daily['down'] = sa_var2
    daily['up_13_sum'] = daily['up'].rolling(window=13,min_periods=0).sum()
    daily['down_13_sum'] = daily['down'].rolling(window=13,min_periods=0).sum()
    daily['min_26'] = daily['low'].rolling(26).min()
    daily['high_26'] = daily['high'].rolling(26).max()
    daily['tmp1'] = daily.apply(lambda x: ((x['close'] - x['min_26'])/(x['high_26'] - x['min_26'])*108) , axis=1)
    daily['tmp1_sma'] = daily['tmp1'].rolling(5).mean()
    daily['tmp2_sma'] = daily['tmp1_sma'].rolling(3).mean()

    daily['tmp_2'] = daily.apply(lambda x: ((x['close']- x['min_26']) / (x['high_26'] - x['min_26'])*108) , axis=1)
    daily['tmp2_1_sma'] = daily['tmp_2'].rolling(5).mean()
    daily['tmp_x'] =  daily.apply(lambda x: (3* x['tmp2_1_sma']-2*x['tmp2_sma']) , axis=1)


    dataframes = daily[-x_count:]
    line80_1 = np.full( shape=len(dataframes.index.values), fill_value=13,dtype=np.int)
    line80=pd.Series(line80_1)
    ap2 = [ mpf.make_addplot(dataframes['tmp_x'],color='g',panel=2),
            mpf.make_addplot(line80,panel=2,color='r',secondary_y=False),
            ]
    df0=dataframes.tail(6)
    print(df0['tmp_x'][-5])
    print(df0['tmp_x'][-1])
    print(save_image)
    if(is_week is True):
        if(dataframes.tail(1)['tmp_x'][-1] > gap and (dataframes.tail(1)['tmp_x'][-1] <40)):
            if(save_image is True):
                mpf.plot(dataframes, title=title,type='candle', addplot=ap2,main_panel=1, savefig='/tmp/chaodie_1_'+code+'.png')
            else:
                mpf.plot(dataframes, title=title,type='candle', addplot=ap2,main_panel=1)
    else:
        if(df0['tmp_x'][-1]< gap and (df0['tmp_x'][-5] < df0['tmp_x'][-1])):
            if(save_image is True):
                mpf.plot(dataframes, title=title,type='candle', addplot=ap2,main_panel=1, savefig='/tmp/chaodie_1_'+code+'.png')
            else:
                mpf.plot(dataframes, title=title,type='candle', addplot=ap2,main_panel=1)

    return dataframes
