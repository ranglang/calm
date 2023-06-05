#!/usr/bin/env python
# encoding: utf-8

import akshare as ak

def get_trade_days():
    tool_trade_date_hist_sina_df = ak.tool_trade_date_hist_sina()
    print(tool_trade_date_hist_sina_df)
    return tool_trade_date_hist_sina_df
