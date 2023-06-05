#!/usr/bin/env python
# encoding: utf-8

import os
from cassandra.auth import PlainTextAuthProvider
from cassandra.cluster import Cluster

from ssl import SSLContext, PROTOCOL_TLSv1_2 , CERT_REQUIRED
from cassandra.auth import PlainTextAuthProvider

# ssl_context = SSLContext(PROTOCOL_TLSv1_2 )
# ssl_context.load_verify_locations('/tmp/cassandra_truststore.jks')
# ssl_context.verify_mode = CERT_REQUIRED
# auth_provider = PlainTextAuthProvider(username='ServiceUserName', password='ServicePassword')

def get():
    auth_provider = PlainTextAuthProvider(username=os.environ['CASSANDRA_USERNAME'],
                                          password=os.environ['CASSANDRA_PASSWORD'])
    cluster = Cluster([os.environ['CASSANDRA_HOST']], auth_provider=auth_provider, port=os.environ['CASSANDRA_PORT'])
    session = cluster.connect(os.environ['CASSANDRA_KEYSPACE'])
    return session

def executeSql(sql):
    session = get()
    session.execute(sql)
    session.shutdown()

def save_vix(session, date, vix, skew):
    session.execute(
        """
        INSERT INTO zz.opt_vix (date, vix, skew)
        VALUES (%s, %s, %s)
        """,
        (date, vix, skew)
    )


def save_ak_stock_em_yjyg(session, scode, sname, sclx, enddate, forecasttype, ndate, hymc, IsLatest, securitytypecode,
                          trademarketcode, forecastl, forecastt, increasel, increaset, forecastcontent,
                          changereasondscrpt, yearearlier, zfpx, jlrpx, forecast):
    session.execute(
        """
        INSERT INTO tribe4.ak_stock_em_yjyg (scode,sname,sclx,enddate,forecasttype,ndate,hymc,IsLatest,securitytypecode,trademarketcode,forecastl,forecastt,increasel,increaset,forecastcontent,changereasondscrpt,yearearlier,zfpx,jlrpx,forecast)
        VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)
        """,
        (scode, sname, sclx, enddate, forecasttype, ndate, hymc, IsLatest, securitytypecode, trademarketcode, forecastl,
         forecastt, increasel, increaset, forecastcontent, changereasondscrpt, yearearlier, zfpx, jlrpx, forecast)
    )
