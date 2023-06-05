# !/usr/bin/python
# # -*- coding: utf-8 -*-
#
# import send_email
# import get_data_medium
# import north
# import chaodie
# import stock_daily
# from jqdatasdk import *
# import jqdatasdk as jq
# from datetime import date
# import os
#
# np_array = get_trade_days(end_date=date.today(), count=100)
#
# concerns = ['sh600582']
#
# def run():
#     for stock in concerns:
#         stock_daily.get_chaodie_by_akshare('sh600582', 100)
#     oos = list(map(lambda x: '/tmp/chaodie_1_%s.png' % x, concerns))
#     #     block_result=block.get_up_block_date()
#     v=get_data_medium.get_medium_by_date(date.today())
#     v1=get_data_medium.get_trend()
#     north_image= north.get_north()
#     #     beixianggegu1=beixianggegu.get_beixianggegu()
#     image_get_up_rate =chaodie.get_trend('000300.XSHG')
#     chaodie1= chaodie.get_trends_chaodie('000300.XSHG')
#     chaodie_image=chaodie1[1]
#     m ="%.4f" %v
#     #     content=
#     content = "中位数"+ m + "\n" +"hs300 chaodie"+chaodie1[0]  + "\n" + "\n"
#     send_email.send_email_by_user("1540911484@qq.com","每日复盘",content , [north_image, v1, image_get_up_rate, chaodie_image])
# # if(date.today() in np_array):
#
# run()
#
