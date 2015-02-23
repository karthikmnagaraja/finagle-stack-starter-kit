package net.finagle.starter
package util

import java.net.{ConnectException, Socket}
/**
 * Created by knagaraj on 2/20/2015.
 */
object Helpers {
  def isPortAvailable(port:Int)={
    require(port>0,"Please specify the appropriate port")

    try{
      val socket:Socket = new Socket("localhost",port)
      socket.close()
      false
    }
    catch {
      case e:ConnectException => true
      case e:Exception =>false
    }
  }

}
