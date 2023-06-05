# #!/usr/bin/python
# # -*- coding: utf-8 -*-
#
# from jqdatasdk import *
# import jqdatasdk as jq
#
# import os
# import numpy as np
# import pandas as pd
#
# industries_sw_l1=get_industries(name='sw_l1', date=None)
# industries_sw_l1_list = list(industries_sw_l1.index)
# industries_sw_l1_np_array = np.array(industries_sw_l1_list)
# s = pd.Series(industries_sw_l1_np_array)
#
# def get_sw_price(code):
#     return finance.run_query(query(finance.SW1_DAILY_PRICE).filter(finance.SW1_DAILY_PRICE.code==code).order_by(finance.SW1_DAILY_PRICE.date.desc()).limit(1)).iloc[0]
#
# def get_sw_price_by_days(code, day_count):
#     return finance.run_query(query(finance.SW1_DAILY_PRICE).filter(finance.SW1_DAILY_PRICE.code==code).order_by(finance.SW1_DAILY_PRICE.date.desc()).limit(day_count))
#
# def get_up_block_date():
#     all_prices = list(map(get_sw_price, industries_sw_l1_list)) ##.sort(key=lambda x: x.change_pct, reverse=True)
#     codes = pd.Series(list(map(lambda k: k['code'], all_prices)))
#     names = pd.Series(list(map(lambda k: k['name'], all_prices)))
#     change_pct = pd.Series(list(map(lambda k: k['change_pct'], all_prices)))
#     pd1 =pd.DataFrame({'code': codes, 'name': names, 'change_pct': change_pct})
#     result = pd1.sort_values(by=['change_pct'], ascending=False).head(10)
#     print(result)
#     return result
