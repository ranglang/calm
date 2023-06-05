#!/usr/bin/env python
# -*- coding: utf-8 -*-

import time
from datetime import timedelta
import akshare as ak
import datetime
import pandas as pd
from MyTT import *

def getChaodie(code, end_date='', count=90):
    print("xxxxxxxxxxxxxxxxxxxx")
    print("xxxxxxxxxxxxxxxxxxxx")
    print("xxxxxxxxxxxxxxxxxxxx")
    print("xxxxxxxxxxxxxxxxxxxx")
    print("xxxxxxxxxxxxxxxxxxxx")
    x = datetime.datetime.now()
    print(x)
    startDate =x + timedelta(-300)
    # '20220808'
    print(startDate.strftime("%Y%m%d"))
    print(x.strftime("%Y%m%d"))
    df = ak.stock_zh_a_hist(symbol=code, period="daily", start_date= startDate.strftime("%Y%m%d"), end_date=x.strftime("%Y%m%d"), adjust="qfq")
    print(str(df))
    CLOSE = df['收盘'].values
    OPEN = df['开盘'].values
    HIGH = df['最高'].values
    LOW = df['最低'].values
    VOL = df['成交量'].values

    # CLOSE = df.close.values
    # OPEN = df.open.values
    # HIGH = df.high.values
    # LOW = df.low.values
    # VOL = df.volume.values

    MA5 = MA(CLOSE, 5)
    MA10 = MA(CLOSE, 10)
    up, mid, lower = BOLL(CLOSE)

    VAR1 = IF(CLOSE > REF(CLOSE, 1), VOL, 0)
    VAR2 = IF(CLOSE < REF(CLOSE, 1), VOL, 0)
    SH = SUM(VAR1, 13)
    UP = SUM(VAR2, 13)

    S1 = (CLOSE - LLV(LOW, 26))
    S2 = (HHV(HIGH, 26) - LLV(LOW, 26))
    S3 = 3 * SMA(S1 / S2 * 108, 5, 1)

    S4 = HHV(HIGH, 26) - LLV(LOW, 26)

    S6 = (CLOSE - LLV(LOW, 26)) / S4 * 108

    S5 = SMA(S6, 5, 1)
    A2 = S3 - 2 * SMA(S5, 3, 1)
    #
    A1 = 3 * SMA((CLOSE - LLV(LOW, 26)) / (HHV(HIGH, 26) - LLV(LOW, 26)) * 108, 5, 1) - 2 * SMA(
        SMA((CLOSE - LLV(LOW, 26)) / (HHV(HIGH, 26) - LLV(LOW, 26)) * 108, 5, 1), 3, 1)
    data = {'date': df['日期'].values,
            'chaodie': A1}
    df = pd.DataFrame(data)
    print(str(df))
    return df


if __name__ == '__main__':
    # auth("18718046351", "Wo070507")
    # 003028.XSHE
    # print(getChaodie('601238.XSHG'))
    print(getChaodie('002328'))
    print("xxxxxxxxxxxxxx")
    # print(getChaodie('003028.XSHE'))
