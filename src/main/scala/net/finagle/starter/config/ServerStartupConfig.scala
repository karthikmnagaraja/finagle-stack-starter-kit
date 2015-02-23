package net.finagle.starter.config

import com.twitter.ostrich.admin.RuntimeEnvironment
import java.net.ServerSocket
import net.finagle.starter.util.Helpers.isPortAvailable
import com.google.common.base.Strings
import net.finagle.starter.util.StartUpServer
/**
 * Created by knagaraj on 2/20/2015.
 */
class ServerStartupConfig {
  var port:Int =8082
 var serverName:String =  "httpserver"

  var runTime:RuntimeEnvironment =null

  def apply(_runTime:RuntimeEnvironment)={
  require(port>0,"Please specify the appropriate ports")
    require( isPortAvailable(port),"Please specify the port which is not in use")
    require(Strings.isNullOrEmpty(serverName),"Please specify the server name")
     new StartUpServer(this)
  }

}
