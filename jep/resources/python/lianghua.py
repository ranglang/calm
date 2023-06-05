#!/usr/bin/env python
# encoding: utf-8

from datetime import timedelta
import datetime
import pandas as pd
from Ashare import *
from MyTT import *
import time

def run(code, end_date=time.strftime('%Y%m%d',time.localtime(time.time())), count=180):
    print("xxxxxxxxxxxxxxxxxxxx")
    ddd = datetime.now()
    dd=ddd + timedelta((-1 *count) + 100)
    # ddd =  datetime.strptime(end_date, "%Y%m%d")
    startDate =dd.strftime('%Y%m%d')
    print("xxxxxxxxxxxxxxxxxxxx", startDate)
    print("xxxxxxxxxxxxxxxxxxxx", end_date)
    df = get_price_akshare(code, start_date= startDate, end_date=end_date)
    CLOSE = df.close.values
    C = df.close.values
    OPEN = df.open.values
    HIGH = df.high.values
    LOW = df.low.values
    VOL = df.volume.values

    AA05=MA(CLOSE,5)
    AA10=MA(C,10)
    AA20=MA(C,20)
    AA30=MA(CLOSE,30)
    GUAILI5=(C-AA05)/AA05*100
    print("AA05")
    print(AA05)
    print("GUALI5")
    print(GUAILI5)
    BB05=REF(AA05,1)
    print("BB05")
    print(BB05)
    print("ATAN")
    print(ATAN((AA05/REF(AA05,1)-1)*100)*180/3.1416)
    BB30=ATAN((AA30/REF(AA30,1)-1)*100)*180/3.1416
    BB10=ATAN((AA10/REF(AA10,1)-1)*100)*180/3.1416
    GUAILI30=(C-AA30)/AA30*100
    print("BB30")
    print(BB30)
    print("BB10")
    print(BB10)
    SUDU5=SMA(EMA((AA05-REF(AA05,1))/REF(AA05,1),3)*100,3,1)
    JIASUDU5=EMA((SUDU5-REF(SUDU5,1)),3);
    QIANGSHIJUJI = EXIST(((BB30>30) & (BB10>45) & CROSS(BB05,60)), 10)
    QIANGSHIJUJI1 = ((BB30>30) & (BB10>45) & CROSS(BB05,60))
    JIACANG = EXIST((COUNT(CROSS(BB05,30),5)>=1) & (AA05>REF(AA05,1)) & (GUAILI30>REF(GUAILI30,1)) & (AA10>REF(AA10,1)) & (JIASUDU5>REF(JIASUDU5,1)) & (SUDU5>REF(SUDU5,1)) ,10) ;
    EEDDS5=EMA(EMA(CLOSE,9),9)
    ZHULIJIANKONG=(EEDDS5-REF(EEDDS5,1))/REF(EEDDS5,1)
    BIANQIANG=(ZHULIJIANKONG>REF(ZHULIJIANKONG,1)) & (ZHULIJIANKONG>0)
    print("BIANQIANG")
    print(BIANQIANG)
    print("JIACANG")
    print(JIACANG)
    print("QIANGSHIJUJI")
    print(QIANGSHIJUJI)
    print("QIANGSHIJUJI1")
    print(QIANGSHIJUJI1)
    print("CROSS(BB05,60)")
    print(CROSS(BB05,60))
    # QIANGSHIJUJI1 = ((BB30>30) & (BB10>45) & CROSS(BB05,60))
    # ZHUANQIANG = ((JIACANG | QIANGSHIJUJI) & BIANQIANG)
    ZHUANQIANG = ((JIACANG | QIANGSHIJUJI) & BIANQIANG)
    print("((加仓 OR 强势狙击) AND 变强)*2")
    print(ZHUANQIANG)

    # print(QIANGSHIJUJI)
    # print("JIACANG")
    # print(JIACANG)

    # 强势狙击:=FILTER(BB30>30 AND BB10>45 AND CROSS(BB05,60),10);
    # 强势狙击:=FILTER(BB30>30 AND BB10>45 AND CROSS(BB05,60),10);

    data = {'date': df.index.values,
            'bb30': BB30}
    df = pd.DataFrame(data)
    print(str(df))
    return df
    # MA5 = MA(CLOSE, 5)


if __name__ == '__main__':
    # 003028.XSHE
    print(run('002763'))
    # print(run('003028.XSHE'))


# ATAN((AA05/REF(AA05,1)-1)*100)*180/3.1416;
#