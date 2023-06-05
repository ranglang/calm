#!/usr/bin/env python
# encoding: utf-8

import stock_daily
import os
import akshare as ak
import jqdatasdk as jq
import get_data_medium
import forcast
import chaodie
import sys


print(sys.path)
print(ak.__version__)

print(str(ak.stock_info_a_code_name()))

jq.auth('15574884809', 'Yasi0000')
# #
# # print(chaodie.get_trends_chaodie_value('000300.XSHG'))
# # print(forcast.get_last_day_forcast_upward())
# # stock_daily.get_chaodie_by_akshare('sh600582', 100)
# # print("test %s" , get_data_medium.get_medium_by_date('2020-11-26'))
