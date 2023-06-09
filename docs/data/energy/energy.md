## [AKShare](https://github.com/akfamily/akshare) 能源数据

### 碳排放

#### 碳排放权-国内

接口: energy_carbon_domestic

目标地址: http://www.tanjiaoyi.com/

描述: 碳交易网-行情信息

限量: 返回指定 symbol 的所有历史数据

输入参数

| 名称     | 类型  | 描述                                                                      |
|--------|-----|-------------------------------------------------------------------------|
| symbol | str | symbol="湖北"; choice of {'湖北', '上海', '北京', '重庆', '广东', '天津', '深圳', '福建'} |

输出参数

| 名称  | 类型      | 描述      |
|-----|---------|---------|
| 日期  | object  |         |
| 成交价 | float64 | 注意单位: 元 |
| 成交量 | float64 | 注意单位: 吨 |
| 成交额 | float64 | -       |
| 地点  | object  | -       |

接口示例

```python
import akshare as ak

energy_carbon_domestic_df = ak.energy_carbon_domestic(symbol="湖北")
print(energy_carbon_domestic_df)
```

数据示例

```
      日期        成交价       成交量           成交额  地点
0     2014-04-02  21.000000  510020.0  1.071040e+07  湖北
1     2014-04-03  24.200001   51468.0  1.245530e+06  湖北
2     2014-04-04  26.620001  304125.0  8.092670e+06  湖北
3     2014-04-05  26.620001       0.0  0.000000e+00  湖北
4     2014-04-06  26.620001       0.0  0.000000e+00  湖北
          ...        ...       ...           ...  ..
1847  2021-03-17  31.799999     535.0  1.701280e+04  湖北
1848  2021-03-18  28.129999     551.0  1.550140e+04  湖北
1849  2021-03-19  30.350000    2074.0  6.293808e+04  湖北
1850  2021-03-22  30.350000    3073.0  9.326129e+04  湖北
1851  2021-03-23  30.350000     100.0  3.508000e+03  湖北
```

#### 碳排放权-北京

接口: energy_carbon_bj

目标地址: https://www.bjets.com.cn/article/jyxx/

描述: 北京市碳排放权电子交易平台-北京市碳排放权公开交易行情

注意: 注意在 2017-08-08 日的数据有误 70.074.00（BEA）

限量: 全部历史数据

输入参数

| 名称  | 类型  | 描述  |
|-----|-----|-----|
| -   | -   | -   |

输出参数

| 名称   | 类型      | 描述        |
|------|---------|-----------|
| 日期   | object  |           |
| 成交量  | int64   | 注意单位: 吨   |
| 成交均价 | float64 | 注意单位: 元/吨 |
| 成交额  | float64 | 注意单位: 元   |
| 成交单位 | object  | -         |

接口示例

```python
import akshare as ak

energy_carbon_bj_df = ak.energy_carbon_bj()
print(energy_carbon_bj_df)
```

数据示例

```
          日期     成交量   成交均价     成交额  成交单位
0     2013-11-28     800  51.25        NaN   NaN
1     2013-12-02     300  55.10        NaN   NaN
2     2013-12-05     100  50.20        NaN   NaN
3     2013-12-06     100  50.00        NaN   NaN
4     2013-12-11     100  50.50        NaN   NaN
          ...     ...    ...        ...   ...
1456  2022-01-04    8370  83.00   694710.0  None
1457  2022-01-12  100000  74.60  7460000.0   BEA
1458  2022-02-10       1  59.70       59.7   BEA
1459  2022-02-14     110  60.00     6600.0   BEA
1460  2022-03-02     100  62.00     6200.0   BEA
```

#### 碳排放权-深圳

接口: energy_carbon_sz

目标地址: http://www.cerx.cn/dailynewsCN/index.htm

描述: 深圳碳排放交易所-国内碳情

限量: 全部历史数据

输入参数

| 名称  | 类型  | 描述  |
|-----|-----|-----|
| -   | -   | -   |

输出参数

| 名称     | 类型      | 描述  |
|--------|---------|-----|
| 交易日期   | object  | -   |
| 市场交易指数 | object  | -   |
| 开盘价    | float64 | -   |
| 最高价    | float64 | -   |
| 最低价    | float64 | -   |
| 成交均价   | float64 | -   |
| 收盘价    | float64 | -   |
| 成交量    | int64   | -   |
| 成交额    | float64 | -   |

接口示例

```python
import akshare as ak

energy_carbon_sz_df = ak.energy_carbon_sz()
print(energy_carbon_sz_df)
```

数据示例

```
     交易日期    市场交易指数   开盘价    最高价    最低价   成交均价    收盘价  成交量    成交额
0    2022-01-21  SZA-2014  10.54  10.54  10.54  10.54  10.54    1  10.54
1    2022-01-21  SZA-2020  13.80    NaN    NaN    NaN  13.80    0   0.00
2    2022-01-21  SZA-2019  16.28  16.28  16.28  16.28  16.28    1  16.28
3    2022-01-21  SZA-2015  16.02  19.58  16.02  16.62  16.02    6  99.74
4    2022-01-21  SZA-2017   6.41    NaN    NaN    NaN   6.41    0   0.00
..          ...       ...    ...    ...    ...    ...    ...  ...    ...
195  2022-03-03  SZA-2016   4.82    NaN    NaN    NaN   4.82    0   0.00
196  2022-03-03  SZA-2017   4.20    NaN    NaN    NaN   4.20    0   0.00
197  2022-03-03  SZA-2018   6.00   6.00   6.00   6.00   6.00    1   6.00
198  2022-03-03  SZA-2019   6.88    NaN    NaN    NaN   6.88    0   0.00
199  2022-03-03  SZA-2020   4.78    NaN    NaN    NaN   4.78    0   0.00
```

#### 碳排放权-国际

接口: energy_carbon_eu

目标地址: http://www.cerx.cn/dailynewsOuter/index.htm

描述: 深圳碳排放交易所-国际碳情

限量: 返回从 2018-03-13 至 2020-04-29 的所有历史数据

输入参数

| 名称  | 类型  | 描述  |
|-----|-----|-----|
| -   | -   | -   |

输出参数

| 名称     | 类型      | 描述  |
|--------|---------|-----|
| 交易日期   | object  | -   |
| 市场交易指数 | object  | -   |
| 开盘价    | float64 | -   |
| 最高价    | float64 | -   |
| 最低价    | float64 | -   |
| 成交均价   | float64 | -   |
| 收盘价    | float64 | -   |
| 成交量    | int64   | -   |
| 成交额    | float64 | -   |

接口示例

```python
import akshare as ak

energy_carbon_eu_df = ak.energy_carbon_eu()
print(energy_carbon_eu_df)
```

数据示例

```
      交易日期 市场交易指数  开盘价  最高价  最低价  成交均价    收盘价  成交量  成交额
0     2018-03-13  欧盟EUA  NaN  NaN  NaN   NaN  11.40  15880000.0  NaN
1     2018-03-13  欧盟CER  NaN  NaN  NaN   NaN   0.19         NaN  NaN
2     2018-03-14  欧盟EUA  NaN  NaN  NaN   NaN  11.18  17926000.0  NaN
3     2018-03-14  欧盟CER  NaN  NaN  NaN   NaN   0.19      3000.0  NaN
4     2018-03-15  欧盟EUA  NaN  NaN  NaN   NaN  11.19  17290000.0  NaN
          ...    ...  ...  ...  ...   ...    ...         ...  ...
997   2020-04-27  欧盟CER  NaN  NaN  NaN   NaN   0.24      1000.0  NaN
998   2020-04-28  欧盟EUA  NaN  NaN  NaN   NaN  20.21  21249000.0  NaN
999   2020-04-28  欧盟CER  NaN  NaN  NaN   NaN   0.25      1000.0  NaN
1000  2020-04-29  欧盟EUA  NaN  NaN  NaN   NaN  20.19  18621000.0  NaN
1001  2020-04-29  欧盟CER  NaN  NaN  NaN   NaN   0.25     96000.0  NaN
```

#### 碳排放权-湖北

接口: energy_carbon_hb

目标地址: http://www.cerx.cn/dailynewsOuter/index.htm

描述: 湖北碳排放权交易中心-现货交易数据-配额-每日概况

限量: 返回从 2017-04-05 至今的所有历史数据

输入参数

| 名称  | 类型  | 描述  |
|-----|-----|-----|
| -   | -   | -   |

输出参数

| 名称   | 类型      | 描述      |
|------|---------|---------|
| 日期   | object  | -       |
| 交易品种 | object  | -       |
| 最新   | float64 | -       |
| 涨跌幅  | float64 | 注意单位: % |
| 最高   | float64 | -       |
| 最低   | float64 | -       |
| 成交量  | float64 | -       |
| 成交额  | float64 | -       |
| 昨收盘价 | float64 | -       |

接口示例

```python
import akshare as ak

energy_carbon_hb_df = ak.energy_carbon_hb()
print(energy_carbon_hb_df)
```

数据示例

```
          日期  交易品种   最新  涨跌幅  最高   最低     成交量      成交额   昨收盘价
0     2017-04-05  HBEA  16.55 -0.30  17.90  16.50   9382.0   167152.08    NaN
1     2017-04-06  HBEA  16.55  0.00  16.55  15.50  11126.0   179145.25  16.55
2     2017-04-07  HBEA  16.03 -3.14  17.00  16.01  38449.0   637564.37  16.55
3     2017-04-10  HBEA  16.00 -0.19  16.48  16.00  11418.0   184092.65  16.03
4     2017-04-11  HBEA  15.89 -0.69  16.19  15.51  34554.0   551255.02  16.00
          ...   ...    ...   ...    ...    ...      ...         ...    ...
1142  2022-02-28  HBEA  51.48 -0.41  54.00  50.00  14478.0   742153.94  51.69
1143  2022-03-01  HBEA  50.50 -1.90  53.00  49.30  16130.0   811078.70  51.48
1144  2022-03-02  HBEA  50.54  0.08  51.95  47.51  11256.0   564317.92  50.50
1145  2022-03-03  HBEA  49.11 -2.83  51.90  48.01  31508.0  1550420.55  50.54
1146  2022-03-04  HBEA  49.30  0.39  50.50  47.00  11774.0   565137.36  49.11
```

#### 碳排放权-广州

接口: energy_carbon_gz

目标地址: http://www.cnemission.com/article/hqxx/

描述: 广州碳排放权交易中心-行情信息

限量: 该接口返回从 2013-12-19 至今的所有历史数据

输入参数

| 名称  | 类型  | 描述  |
|-----|-----|-----|
| -   | -   | -   |

输出参数

| 名称   | 类型      | 描述      |
|------|---------|---------|
| 日期   | object  | -       |
| 品种   | object  | -       |
| 开盘价  | float64 | -       |
| 收盘价  | float64 | -       |
| 最高价  | float64 | -       |
| 最低价  | float64 | -       |
| 涨跌   | float64 | -       |
| 涨跌幅  | float64 | 注意单位: % |
| 成交数量 | int64   | -       |
| 成交金额 | float64 | -       |

接口示例

```python
import akshare as ak

energy_carbon_gz_df = ak.energy_carbon_gz()
print(energy_carbon_gz_df)
```

数据示例

```
          日期    品种    开盘价    收盘价  ...    涨跌   涨跌幅    成交数量        成交金额
0     2013-12-19  GDEA  60.00  60.17  ...  0.17  0.28  120029  7221740.00
1     2013-12-20  GDEA  60.17  60.00  ... -0.17 -0.28     100     6000.00
2     2014-03-11  GDEA  60.00  60.00  ...  0.00  0.00    5242   314520.00
3     2014-03-14  GDEA  60.00  63.00  ...  3.00  5.00     200    12600.00
4     2014-03-17  GDEA  63.00  65.00  ...  2.00  3.17     100     6500.00
          ...   ...    ...    ...  ...   ...   ...     ...         ...
1718  2022-02-28  GDEA  72.24  71.38  ... -0.86 -1.19    9468   675792.95
1719  2022-03-01  GDEA  71.38  69.44  ... -1.94 -2.72    3239   224927.37
1720  2022-03-02  GDEA  69.44  69.57  ...  0.13  0.19   18551  1290675.12
1721  2022-03-03  GDEA  69.57  66.95  ... -2.62 -3.77  135661  8450773.49
1722  2022-03-04  GDEA  66.95  66.80  ... -0.15 -0.22    8042   537213.18
```

### 中国油价

#### 汽柴油历史调价信息

接口: energy_oil_hist

目标地址: http://data.eastmoney.com/cjsj/oil_default.html

描述: 东方财富-数据中心-中国油价-汽柴油历史调价信息

限量: 单次返回中国油价的所有历史数据

输入参数

| 名称  | 类型  | 描述  |
|-----|-----|-----|
| -   | -   | -   |

输出参数

| 名称   | 类型      | 描述        |
|------|---------|-----------|
| 调整日期 | object  | 价格调整的日期   |
| 汽油价格 | int64   | 注意单位: 元/吨 |
| 柴油价格 | int64   | 注意单位: 元/吨 |
| 汽油涨幅 | float64 | 注意单位: 元/吨 |
| 柴油涨幅 | float64 | 注意单位: 元/吨 |

接口示例

```python
import akshare as ak

energy_oil_hist_df = ak.energy_oil_hist()
print(energy_oil_hist_df)
```

数据示例

```
     调整日期   汽油价格  柴油价格  汽油涨跌 柴油涨跌
0    2022-05-17  10060  8980  285.0  270.0
1    2022-04-29   9775  8710  205.0  200.0
2    2022-04-16   9570  8510 -545.0 -530.0
3    2022-04-01  10115  9040  110.0  110.0
4    2022-03-18  10005  8930  750.0  720.0
..          ...    ...   ...    ...    ...
234  2000-10-20   3435  3440 -180.0  370.0
235  2000-09-20   3615  3070  210.0  300.0
236  2000-08-18   3405  2770  270.0  160.0
237  2000-07-15   3135  2610  200.0  180.0
238  2000-06-06   2935  2430    NaN    NaN
```

#### 地区油价

接口: energy_oil_detail

目标地址: http://data.eastmoney.com/cjsj/oil_default.html

描述: 东方财富-数据中心-中国油价-地区油价

限量: 返回指定调价日的全国各地区的油价的历史数据

输入参数

| 名称   | 类型  | 描述                                                              |
|------|-----|-----------------------------------------------------------------|
| date | str | date="20200319"; 此日期为调价日期, 通过调用 ak.energy_oil_hist() 可以获取历史调价日期 |

输出参数

| 名称     | 类型      | 描述                    |
|--------|---------|-----------------------|
| 日期     | object  | 价格调整的日期               |
| V_0    | float64 | 0#柴油价格(单位:元/升)        |
| V_92   | float64 | 92#汽油价格(单位:元/升)       |
| V_95   | float64 | 95#汽油价格(单位:元/升)       |
| V_89   | float64 | 89#汽油价格(单位:元/升)       |
| 地区     | object  | 地区                    |
| ZDE_0  | float64 | 0#柴油涨幅(单位:元/升)        |
| ZDE_92 | float64 | 92#汽油涨幅(单位:元/升)       |
| ZDE_95 | float64 | 95#汽油涨幅(单位:元/升)       |
| ZDE_89 | float64 | 89#汽油涨幅(单位:元/升)       |
| QE_0   | float64 | 上一次调整时0#柴油价格(单位:元/升)  |
| QE_92  | float64 | 上一次调整时92#汽油价格(单位:元/升) |
| QE_95  | float64 | 上一次调整时95#汽油价格(单位:元/升) |
| QE_89  | float64 | 上一次调整时89#汽油价格(单位:元/升) |

接口示例

```python
import akshare as ak

energy_oil_detail_df = ak.energy_oil_detail(date="20220517")
print(energy_oil_detail_df)
```

数据示例

```
         日期       V_0      V_92  ...     QE_92      QE_95     QE_89
0   2022-05-17  8.420000  8.630000  ...  8.410000   8.990000  7.880000
1   2022-05-17  8.430000  8.690000  ...  8.460000   9.010000  7.920000
2   2022-05-17  8.370000  8.650000  ...  8.420000   8.990000  7.840000
3   2022-05-17  8.270000  8.690000  ...  8.460000   9.040000  7.820000
4   2022-05-17  8.380000  8.710000  ...  8.480000   9.190000  7.870000
5   2022-05-17  8.430000  8.750000  ...  8.520000   9.200000  7.930000
6   2022-05-17  8.480000  8.820000  ...  8.590000   9.080000  8.110000
7   2022-05-17  8.470000  9.800000  ...  9.570000  10.170000  8.820000
8   2022-05-17  8.390000  8.690000  ...  8.460000   8.940000  7.840000
9   2022-05-17  8.370000  8.700000  ...  8.470000   9.050000       NaN
10  2022-05-17  8.370000  8.700000  ...  8.480000   9.070000       NaN
11  2022-05-17  8.451251  8.631883  ...  8.405251   8.934642  7.876304
12  2022-05-17  8.340000  8.660000  ...  8.430000   8.970000  7.900000
13  2022-05-17  8.430000  8.640000  ...  8.420000   9.040000  7.830000
14  2022-05-17  8.250000  8.580000  ...  8.360000   8.830000  7.880000
15  2022-05-17  8.290000  8.650000  ...  8.420000   9.030000  7.900000
16  2022-05-17  8.380000  8.670000  ...  8.440000   9.060000  7.850000
17  2022-05-17  8.460000  8.630000  ...  8.400000   9.070000  7.870000
18  2022-05-17  8.260000  8.570000  ...  8.340000   8.810000  7.870000
19  2022-05-17  8.360000  8.650000  ...  8.420000   8.960000  7.860000
20  2022-05-17  8.410000  8.780000  ...  8.550000   9.140000  7.940000
21  2022-05-17  8.390000  8.690000  ...  8.460000   8.940000  7.840000
22  2022-05-17  8.910000  9.560000  ...  9.330000   9.870000  8.800000
23  2022-05-17  8.444700  8.838280  ...  8.609288   9.240616  7.929100
24  2022-05-17  8.360000  8.660000  ...  8.430000   8.960000  7.810000
25  2022-05-17  8.440000  8.740000  ...  8.520000   9.000000  8.050000
```
