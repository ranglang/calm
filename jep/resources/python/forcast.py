# #!/usr/bin/python
# # -*- coding: utf-8 -*-
#
# from jqdatasdk import *
# import jqdatasdk as jq
# from datetime import datetime
# from jqdatasdk import finance
#
# def get_last_trade_lay():
#     return get_trade_days(end_date=format_time(), count=10)
#
# def format_time():
#     return datetime.today().strftime('%Y-%m-%d')
#
# def get_last_day_forcast():
#     a_days = get_last_trade_lay()
#     return finance.run_query(query(finance.STK_FIN_FORCAST).filter(finance.STK_FIN_FORCAST.pub_date > a_days[1]).filter(finance.STK_FIN_FORCAST.pub_date <= a_days[-1]).order_by(finance.STK_FIN_FORCAST.pub_date.desc()).limit(100))
#
# def get_last_day_forcast_upward():
#     a_days = get_last_trade_lay()
#     return finance.run_query(query(finance.STK_FIN_FORCAST).filter(finance.STK_FIN_FORCAST.type=='业绩大幅上升').filter(finance.STK_FIN_FORCAST.pub_date > a_days[1]).filter(finance.STK_FIN_FORCAST.pub_date <= a_days[-1]).order_by(finance.STK_FIN_FORCAST.pub_date.desc()).limit(100))
