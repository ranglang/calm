#!/usr/bin/env python
# encoding: utf-8

import akshare
import sys
import os

sys.path.insert(0, "%s/jep/resources/python" % os.getcwd())
import ak.dates as dt
import opt


def run_opt():
    print(opt.get())

def dates():
    return dt.get_trade_days()


def log_path():
    return sys.path


def save_trade_days():
    tool_trade_date_hist_sina_df = akshare.tool_trade_date_hist_sina()

def add():
    print("abcd efg")
