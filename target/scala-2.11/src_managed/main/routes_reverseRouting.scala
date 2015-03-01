// @SOURCE:/Users/Rocky/Documents/projects/github/scala-form-with-enum/conf/routes
// @HASH:98b1ed7d24aba9e43dd91be4c3db282b6bb5f6c6
// @DATE:Fri Feb 20 08:21:25 GMT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:7
// @LINE:6
class ReversePersonController {


// @LINE:7
def create(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "person")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:10
class ReverseAssets {


// @LINE:10
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          
}
                  


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:7
// @LINE:6
class ReversePersonController {


// @LINE:7
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonController.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:10
class ReverseAssets {


// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              
}
        


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:7
// @LINE:6
class ReversePersonController {


// @LINE:7
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonController", "create", Seq(), "POST", """""", _prefix + """person""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonController", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:10
class ReverseAssets {


// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          
}
        
    