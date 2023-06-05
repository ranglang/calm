# #!/usr/bin/python
# # -*- coding: utf-8 -*-
#
# import block
# import send_email
# import get_data_medium
#
# from jqdatasdk import *
# import jqdatasdk as jq
# from datetime import date
#
# np_array = get_trade_days(end_date=date.today(), count=100)
#
# if(date.today() in np_array):
#     block_result=block.get_up_block_date()
#     v=get_data_medium.get_medium_by_date(date.today())
#     print("%.4f" %v)
#     send_email.sendEmail("板块", str(block_result), [])
#
# if(jq.is_auth()):
#     jq.logout()
