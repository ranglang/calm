# #!/usr/bin/env python
# # encoding: utf-8
#
# import matplotlib.pyplot as plt
# from jqdatasdk import *
# import jqdatasdk as jq
# from datetime import date
#
# def get_medium_by_date(date):
#     stocks = list(get_all_securities(['stock']).index)
#     df2 = get_price(stocks, count=1, end_date=date, frequency='daily', fields=['pre_close', 'close']) # 获得000001.XSHG的2015年01月的分钟数据, 只获取open+close字段
#     df1=df2.dropna(thresh=1)
#     df1['ch'] = (df1['close']- df1['pre_close']) /df1['pre_close']
#     sorted_dataframe =df1.sort_values(['ch'])
#     sorted_list = sorted_dataframe.reset_index(inplace = True)
#     fount_item = sorted_dataframe[sorted_dataframe['ch'] > sorted_dataframe['ch'].median()].iloc[0]
#     return fount_item['ch']
#
# # def get_trend():
# #     np_array = get_trade_days(end_date=date.today(), count=30)
# #     a1=map(lambda x: get_medium_by_date(x), np_array)
# #     rlist =list(a1)
# #     plt.plot(rlist)
# #     plt.title('Medium 30 days')
# #     plt.ylabel('some numbers')
# #     plt.xlabel('x values')
# #     plt.ylabel('y values')
# #     plt.title('middium 30 days')
# #     plt.legend(['line 1'])
# #
# #     plt.rcParams['font.sans-serif']=['SimHei'] #用来正常显示中文标签
# #     plt.rcParams['axes.unicode_minus']=False #用来正常显示负号
# #     plt.savefig("/tmp/middle.png", format="png", dpi=300, bbox_inches='tight')
# #     plt.show()
# #     return "/tmp/middle.png"