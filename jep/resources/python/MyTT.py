#!/usr/bin/env python
# encoding: utf-8
import numpy as np; import pandas as pd
import functools
import math

def RD(N,D=3):   return np.round(N,D)
def RET(S,N=1):  return np.array(S)[-N]
def ABS(S):      return np.abs(S)
def MAX(S1,S2):  return np.maximum(S1,S2)
def MIN(S1,S2):  return np.minimum(S1,S2)

def MA(S,N):
    return pd.Series(S).rolling(N).mean().values

def REF(S, N=1):
    return pd.Series(S).shift(N).values  

def DIFF(S, N=1):
    return pd.Series(S).diff(N)

def STD(S,N):
    return  pd.Series(S).rolling(N).std(ddof=0).values

def IF(S_BOOL,S_TRUE,S_FALSE):
    return np.where(S_BOOL, S_TRUE, S_FALSE)

def SUM(S, N):
    return pd.Series(S).rolling(N).sum().values if N>0 else pd.Series(S).cumsum()

def HHV(S,N):
    return pd.Series(S).rolling(N).max().values

def LLV(S,N):
    return pd.Series(S).rolling(N).min().values

def EMA(S,N):
    return pd.Series(S).ewm(span=N, adjust=False).mean().values

def SMA_CN(close, timeperiod) :
    return functools.reduce(lambda x, y: ((timeperiod - 1) * x + y) / timeperiod, close)

def SMA(S, N, M=1):
    series=pd.Series(S)
    results = np.nan_to_num(series).copy()
    # FIXME this is very slow
    for i in range(1, len(series)):
        results[i] = ((N - 1) * results[i - 1] + results[i]) / N
    return results

def ATAN(S):
    series=pd.Series(S)
    results = np.nan_to_num(series).copy()
    # FIXME this is very slow
    for i in range(1, len(series)):
        results[i] = math.atan(results[i])
    return results

def AVEDEV(S,N):
    avedev=pd.Series(S).rolling(N).apply(lambda x: (np.abs(x - x.mean())).mean())
    return avedev.values

def SLOPE(S,N,RS=False):
    M=pd.Series(S[-N:]);   poly = np.polyfit(M.index, M.values,deg=1);    Y=np.polyval(poly, M.index);
    if RS: return Y[1]-Y[0],Y
    return Y[1]-Y[0]

  
def COUNT(S_BOOL, N):
    return SUM(S_BOOL,N)

def EVERY(S_BOOL, N):
    R=SUM(S_BOOL, N)
    return  IF(R==N, True, False)
  
def LAST(S_BOOL, A, B):
    if A<B: A=B
    return S_BOOL[-A:-B].sum()==(A-B)

def EXIST(S_BOOL, N=5):
    R=SUM(S_BOOL,N)    
    return IF(R>0, True ,False)

def BARSLAST(S_BOOL):
    M=np.argwhere(S_BOOL);
    return len(S_BOOL)-int(M[-1])-1  if M.size>0 else -1

def FORCAST(S,N):
    K,Y=SLOPE(S,N,RS=True)
    return Y[-1]+K
  
def CROSS(S1,S2):
    CROSS_BOOL=IF(S1>S2, True ,False)   
    return COUNT(CROSS_BOOL>0,2)==1



def MACD(CLOSE,SHORT=12,LONG=26,M=9):
    DIF = EMA(CLOSE,SHORT)-EMA(CLOSE,LONG);  
    DEA = EMA(DIF,M);      MACD=(DIF-DEA)*2
    return RD(DIF),RD(DEA),RD(MACD)

def KDJ(CLOSE,HIGH,LOW, N=9,M1=3,M2=3):
    RSV = (CLOSE - LLV(LOW, N)) / (HHV(HIGH, N) - LLV(LOW, N)) * 100
    K = EMA(RSV, (M1*2-1));    D = EMA(K,(M2*2-1));        J=K*3-D*2
    return K, D, J

def RSI(CLOSE, N=24):      
    DIF = CLOSE-REF(CLOSE,1) 
    return RD(SMA(MAX(DIF,0), N) / SMA(ABS(DIF), N) * 100)  

def WR(CLOSE, HIGH, LOW, N=10, N1=6):
    WR = (HHV(HIGH, N) - CLOSE) / (HHV(HIGH, N) - LLV(LOW, N)) * 100
    WR1 = (HHV(HIGH, N1) - CLOSE) / (HHV(HIGH, N1) - LLV(LOW, N1)) * 100
    return RD(WR), RD(WR1)

def BIAS(CLOSE,L1=6, L2=12, L3=24):
    BIAS1 = (CLOSE - MA(CLOSE, L1)) / MA(CLOSE, L1) * 100
    BIAS2 = (CLOSE - MA(CLOSE, L2)) / MA(CLOSE, L2) * 100
    BIAS3 = (CLOSE - MA(CLOSE, L3)) / MA(CLOSE, L3) * 100
    return RD(BIAS1), RD(BIAS2), RD(BIAS3)

def BOLL(CLOSE,N=20, P=2):
    MID = MA(CLOSE, N); 
    UPPER = MID + STD(CLOSE, N) * P
    LOWER = MID - STD(CLOSE, N) * P
    return RD(UPPER), RD(MID), RD(LOWER)    

def PSY(CLOSE,N=12, M=6):  
    PSY=COUNT(CLOSE>REF(CLOSE,1),N)/N*100
    PSYMA=MA(PSY,M)
    return RD(PSY),RD(PSYMA)

def CCI(CLOSE,HIGH,LOW,N=14):  
    TP=(HIGH+LOW+CLOSE)/3
    return (TP-MA(TP,N))/(0.015*AVEDEV(TP,N))
        
def ATR(CLOSE,HIGH,LOW, N=20):
    TR = MAX(MAX((HIGH - LOW), ABS(REF(CLOSE, 1) - HIGH)), ABS(REF(CLOSE, 1) - LOW))
    return MA(TR, N)

def BBI(CLOSE,M1=3,M2=6,M3=12,M4=20):
    return (MA(CLOSE,M1)+MA(CLOSE,M2)+MA(CLOSE,M3)+MA(CLOSE,M4))/4    

def DMI(CLOSE,HIGH,LOW,M1=14,M2=6):
    TR = SUM(MAX(MAX(HIGH - LOW, ABS(HIGH - REF(CLOSE, 1))), ABS(LOW - REF(CLOSE, 1))), M1)
    HD = HIGH - REF(HIGH, 1);     LD = REF(LOW, 1) - LOW
    DMP = SUM(IF((HD > 0) & (HD > LD), HD, 0), M1)
    DMM = SUM(IF((LD > 0) & (LD > HD), LD, 0), M1)
    PDI = DMP * 100 / TR;         MDI = DMM * 100 / TR
    ADX = MA(ABS(MDI - PDI) / (PDI + MDI) * 100, M2)
    ADXR = (ADX + REF(ADX, M2)) / 2
    return PDI, MDI, ADX, ADXR  

def TAQ(HIGH,LOW,N):
    UP=HHV(HIGH,N);    DOWN=LLV(LOW,N);    MID=(UP+DOWN)/2
    return UP,MID,DOWN

def KTN(CLOSE,HIGH,LOW,N=20,M=10):
    MID=EMA((HIGH+LOW+CLOSE)/3,N)
    ATRN=ATR(CLOSE,HIGH,LOW,M)
    UPPER=MID+2*ATRN;   LOWER=MID-2*ATRN
    return UPPER,MID,LOWER       
  
def TRIX(CLOSE,M1=12, M2=20):
    TR = EMA(EMA(EMA(CLOSE, M1), M1), M1)
    TRIX = (TR - REF(TR, 1)) / REF(TR, 1) * 100
    TRMA = MA(TRIX, M2)
    return TRIX, TRMA

def VR(CLOSE,VOL,M1=26):
    LC = REF(CLOSE, 1)
    return SUM(IF(CLOSE > LC, VOL, 0), M1) / SUM(IF(CLOSE <= LC, VOL, 0), M1) * 100

def EMV(HIGH,LOW,VOL,N=14,M=9):
    VOLUME=MA(VOL,N)/VOL;       MID=100*(HIGH+LOW-REF(HIGH+LOW,1))/(HIGH+LOW)
    EMV=MA(MID*VOLUME*(HIGH-LOW)/MA(HIGH-LOW,N),N);    MAEMV=MA(EMV,M)
    return EMV,MAEMV


def DPO(CLOSE,M1=20, M2=10, M3=6):
    DPO = CLOSE - REF(MA(CLOSE, M1), M2);    MADPO = MA(DPO, M3)
    return DPO, MADPO

def BRAR(OPEN,CLOSE,HIGH,LOW,M1=26):
    AR = SUM(HIGH - OPEN, M1) / SUM(OPEN - LOW, M1) * 100
    BR = SUM(MAX(0, HIGH - REF(CLOSE, 1)), M1) / SUM(MAX(0, REF(CLOSE, 1) - LOW), M1) * 100
    return AR, BR

def DMA(CLOSE,N1=10,N2=50,M=10):
    DIF=MA(CLOSE,N1)-MA(CLOSE,N2);    DIFMA=MA(DIF,M)
    return DIF,DIFMA

def MTM(CLOSE,N=12,M=6):
    MTM=CLOSE-REF(CLOSE,N);         MTMMA=MA(MTM,M)
    return MTM,MTMMA

def MASS(HIGH,LOW,N1=9,N2=25,M=6):
    MASS=SUM(MA(HIGH-LOW,N1)/MA(MA(HIGH-LOW,N1),N1),N2)
    MA_MASS=MA(MASS,M)
    return MASS,MA_MASS
  
def ROC(CLOSE,N=12,M=6):
    ROC=100*(CLOSE-REF(CLOSE,N))/REF(CLOSE,N);    MAROC=MA(ROC,M)
    return ROC,MAROC  

def EXPMA(CLOSE,N1=12,N2=50):
    return EMA(CLOSE,N1),EMA(CLOSE,N2);

def OBV(CLOSE,VOL):
    return SUM(IF(CLOSE>REF(CLOSE,1),VOL,IF(CLOSE<REF(CLOSE,1),-VOL,0)),0)/10000

def ASI(OPEN,CLOSE,HIGH,LOW,M1=26,M2=10):
    LC=REF(CLOSE,1);      AA=ABS(HIGH-LC);     BB=ABS(LOW-LC);
    CC=ABS(HIGH-REF(LOW,1));   DD=ABS(LC-REF(OPEN,1));
    R=IF( (AA>BB) & (AA>CC),AA+BB/2+DD/4,IF( (BB>CC) & (BB>AA),BB+AA/2+DD/4,CC+DD/4));
    X=(CLOSE-LC+(CLOSE-OPEN)/2+LC-REF(OPEN,1));
    SI=16*X/R*MAX(AA,BB);   ASI=SUM(SI,M1);   ASIT=MA(ASI,M2);
    return ASI,ASIT   
