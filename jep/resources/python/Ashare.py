#-*- coding:utf-8 -*-    --------------Ashare 股票行情数据双核心版( https://github.com/mpquant/Ashare )

import json,requests,datetime;
import pysnowball as ball
import pandas as pd  #
import time
from datetime import timedelta
from datetime import datetime
import akshare as ak

def get_price_akshare(stock, start_date='', end_date='',count=10, frequency='1d', fields=[]):        #对外暴露只有唯一函数，这样对用户才是最友好的
    print("stock %s", stock)
    hotPrice = None
    print("hotPrice == None %s", hotPrice == None)
    try:
        v = ball.quotec(stock.upper())['data'][0]
        bbb = v['open']
        print("bbb %s", bbb)
        hotPrice = v
    except:
        print("except for hotPrice")

    print("hotPrice == None %s", hotPrice == None)

    xcode= stock.replace('sh','').replace('sz','')                      #证券代码编码兼容处理

    ddd = datetime.now()
    today = ddd.strftime("%Y-%m-%d")
    try:
        print('stock_zh_a_hist %s', xcode)
        df = ak.stock_zh_a_hist(symbol=xcode, period="daily", start_date= start_date, end_date=end_date, adjust="qfq")
        df['time'] = df['日期']
        df['open'] = df['开盘']
        df['close'] = df['收盘']
        df['high'] = df['最高']
        df['low'] = df['最低']
        df['volume'] = df['成交量']

        df = df[["time", "open", "close", "high", "low", "volume"]]
        if ((today in df['time'].values) or (hotPrice == None)):
            pass
        else:
            new_row = pd.Series([today, hotPrice['open'], hotPrice['last_close'], hotPrice['high'], hotPrice['low'], hotPrice['volume'] / 100],
                          index=df.columns)
            df = df.append(new_row, ignore_index=True)
        return  df
    except:
        print('stock_zh_a_daily %s', xcode)
        time.sleep(1.3)
        df = ak.stock_zh_a_daily(symbol=stock, start_date= start_date, end_date=end_date, adjust="qfq")
        df['time'] = df['date']
        df = df[["time", "open", "close", "high", "low", "volume"]]
        if ((today in df['time'].values) or (hotPrice == None)):
            pass
        else:
            new_row = pd.Series([today, hotPrice['open'], hotPrice['last_close'], hotPrice['high'], hotPrice['low'], hotPrice['volume'] / 100],
                            index=df.columns)
            df = df.append(new_row, ignore_index=True)
        return  df



