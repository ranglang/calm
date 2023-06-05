package com.lqiong.claim.actor

import java.net.InetAddress

object NetUtils {
  def getHostName = {
    val ip = InetAddress.getLocalHost();
    val hostname = ip.getHostName();
    hostname
  }
}
