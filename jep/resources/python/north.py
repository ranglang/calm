#!/usr/bin/python
# -*- coding: utf-8 -*-

import matplotlib.pyplot as plt
import akshare as ak
stock_em_hsgt_north_net_flow_in_df = ak.stock_em_hsgt_north_net_flow_in(indicator="沪股通")
stock_em_hsgt_north_net_flow_in_df['value'] = stock_em_hsgt_north_net_flow_in_df['value'].astype(float)


def get_north():
    ddf = stock_em_hsgt_north_net_flow_in_df.tail(30)
    import matplotlib.pyplot as plt
    plt.plot(ddf['value'])
    plt.title('North 30 days')
    plt.ylabel('some numbers')
    plt.xlabel('x values')
    plt.ylabel('y values')
    plt.title('plotted x and y values')
    plt.legend(['line 1'])

    plt.rcParams['font.sans-serif']=['SimHei'] #用来正常显示中文标签
    plt.rcParams['axes.unicode_minus']=False #用来正常显示负号
    plt.savefig("/tmp/1.png", format="png", dpi=300, bbox_inches='tight')
    plt.show()
    return "/tmp/1.png"
