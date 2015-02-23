package net.finagle.starter.util

import com.twitter.ostrich.admin.{Service=>AdminService}
import net.finagle.starter.config.{ServerStartupConfig=> Config}
import com.twitter.conversions.time._
import com.twitter.logging.Logger
/*
 * Created by knagaraj on 2/20/2015.
 */
class StartUpServer(config:Config) extends AdminService{
  val log= Logger.get(this.getClass)
  override def start(): Unit = {
    log.debug("Service will be running on %s server and on port %d",config.serverName,config.port)
    //server
  }

  override def shutdown(): Unit = {

  }
}
