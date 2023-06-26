import pandas as pd
from datetime import datetime
from datetime import timedelta
import numpy as np
from datetime import date
import akshare as ak
import os
import datetime
from Ashare import *
from MyTT import *
# import jqdatasdk as jq
# from jqdatasdk import *

def getByL(date, code):
    index_stock_cons_df = ak.index_stock_cons(symbol=code)
    index_stock_cons_df['symbol'] = index_stock_cons_df['品种代码'].apply(ak.stock_a_code_to_symbol)

    col_one_list = index_stock_cons_df['symbol'].tolist()

    l1 = map(lambda  x: get_price_akshare(x, end_date=date, frequency='1d', count=1).iloc[0], col_one_list)
    # from_records
    # , columns=['open' , 'close',  'high',   'low',    'volume']
    a1 = np.array(list(l1))
    llll = pd.DataFrame(a1)
    return llll

def aIndex(x, indexDate):
    pd1 = pd.DataFrame(x)
    pd1.columns=['time',   'open',  'close',   'high',    'low' ,'volume']
    try:
        a= pd1[pd1['time']==indexDate].iloc[0]
    except:
        print("except")
        d = {'time': 1,'open': 1, 'close': 1,}
        ser = pd.Series(data=d, index=['time','open','close'])
        a= ser
    return a

def getBy(numpyData, numyArray):
    ll11 =list(map(lambda x: aIndex(x, numpyData), numyArray))
    # open  high   low  close       volume

    d=map(lambda  a1: a1[2]- a1[1] , ll11)
    arr1 = np.array(list(d))
    dddsize=arr1.size

    up= arr1[arr1> 0].size
    down= arr1[arr1< 0].size


    # getByDate=getByL(date,code)
    # stocks = get_index_stocks(code)
    # getByDate = get_price(stocks, start_date=date, end_date=date, frequency='daily', fields=None,
    #                       skip_paused=False, fq='pre')
    # getByDate['cp'] = (getByDate['close'] - getByDate['open']) / getByDate['open']
    # df = len(getByDate[getByDate['cp'] > 0].index.values)
    # df2 = len(getByDate[getByDate['cp'] < 0].index.values)
    return {'index': numpyData, 'date': numpyData, 'up': up, 'down': down}

def get_price_a(code, startdate, enddate):
    df1= get_price_akshare(stock=code,  start_date=startdate.strftime("%Y%m%d"), end_date=enddate.strftime("%Y%m%d"))
    return df1


def dataList(code, startdate, enddate):
    index_stock_cons_df = ak.index_stock_cons(symbol=code)
    index_stock_cons_df['symbol'] = index_stock_cons_df['品种代码'].apply(ak.stock_a_code_to_symbol)
    col_one_list = index_stock_cons_df['symbol'].tolist()
    l1 = map(lambda  x:get_price_a(x, startdate, enddate) , col_one_list)
    ld_ddd=np.array(list(l1))

    ff = pd.DataFrame(ld_ddd[0])
    ff.columns=['time',   'open',  'close',   'high',    'low' ,'volume']
    ddddddddddddd = ff['time'].values
    acal = list(map(lambda x: getBy(x, ld_ddd),  ddddddddddddd ))

    ADVANCE = pd.Series(data=map(lambda x: x['up'], acal), index=ff.index.values)
    DECLINE = pd.Series(data=map(lambda x: x['down'], acal), index=ff.index.values)

#     BTID = 100 * ADVANCE / (ADVANCE + DECLINE)
    BTID = 100 * DECLINE / (ADVANCE + DECLINE)
    A = MA(BTID, 6)

    l = ak.tool_trade_date_hist_sina()
    l33 = l[l['trade_date'] <= pd.to_datetime("today")]

    list1=np.array(list(l33['trade_date'].tail(A.size)))
    frame = {'value': A, 'date': list1}
    result = pd.DataFrame(frame)
    return result


def indexChaodie(code):
    l = ak.tool_trade_date_hist_sina()
    l33 = l[l['trade_date'] < datetime.now().date()]
    print("ln")
    print(l33)
    #l33 = l[l['trade_date'] < pd.to_datetime("today")]
    list1=np.array(list(l33['trade_date'].tail(101)))
    start_date=list1[0]
    end_date=list1[-1]
    return dataList(code, start_date, end_date)

if __name__ == '__main__':
    now = datetime.now()
    print(now)
    print(indexChaodie("000016").tail(20))
    now = datetime.now()
    print(now)
