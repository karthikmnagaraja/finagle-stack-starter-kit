package net.finagle.starter

import java.net.InetSocketAddress

import com.twitter.finagle.Service
import com.twitter.finagle.builder.ServerBuilder
import com.twitter.finagle.http.Http
import com.twitter.io.Charsets.Utf8
import com.twitter.util.Future
import org.jboss.netty.buffer.ChannelBuffers.copiedBuffer
import org.jboss.netty.handler.codec.http.HttpResponseStatus._
import org.jboss.netty.handler.codec.http.HttpVersion.HTTP_1_1
import org.jboss.netty.handler.codec.http._

import scala.util.Random

/**
 * Created by knagaraj on 2/18/2015.
 */
object Server {

  class Respond extends Service[HttpRequest,HttpResponse]{
    def apply(request: HttpRequest)={
      val response= new DefaultHttpResponse(HTTP_1_1,OK)
      response.setContent(copiedBuffer("hello world"+ Random.nextInt(5),Utf8))
      Future.value(response)
    }
  }
  def main (args: Array[String]) {

    var respond= new Respond
    val testService:Service[HttpRequest,HttpResponse]=respond

    ServerBuilder().
      codec(Http()).bindTo(new InetSocketAddress(8081)).name("httpserver").build(testService)
  }


}
