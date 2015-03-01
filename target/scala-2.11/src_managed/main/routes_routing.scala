// @SOURCE:/Users/Rocky/Documents/projects/github/scala-form-with-enum/conf/routes
// @HASH:98b1ed7d24aba9e43dd91be4c3db282b6bb5f6c6
// @DATE:Fri Feb 20 08:21:25 GMT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_PersonController_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_PersonController_index0_invoker = createInvoker(
controllers.PersonController.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonController", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_PersonController_create1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("person"))))
private[this] lazy val controllers_PersonController_create1_invoker = createInvoker(
controllers.PersonController.create,
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonController", "create", Nil,"POST", """""", Routes.prefix + """person"""))
        

// @LINE:10
private[this] lazy val controllers_Assets_at2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.PersonController.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """person""","""controllers.PersonController.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_PersonController_index0_route(params) => {
   call { 
        controllers_PersonController_index0_invoker.call(controllers.PersonController.index)
   }
}
        

// @LINE:7
case controllers_PersonController_create1_route(params) => {
   call { 
        controllers_PersonController_create1_invoker.call(controllers.PersonController.create)
   }
}
        

// @LINE:10
case controllers_Assets_at2_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     