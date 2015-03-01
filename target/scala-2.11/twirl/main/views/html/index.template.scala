
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<div class="panel panel-default">
        <div class="panel-body">
            <h3>Create Person</h3>
            <form role="form" action=""""),_display_(/*7.40*/routes/*7.46*/.PersonController.create()),format.raw/*7.72*/("""" method="post">
                <input name="id" type = "hidden" value="0"/>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control" id="email" name="email">
                </div>
                <div class="form-group">
                    <label for="firstname">Firstname:</label>
                    <input type="text" class="form-control" id="firstname" name="firstname">
                </div>
                <div class="form-group">
                    <label for="surname">Surname:</label>
                    <input type="text" class="form-control" id="surname" name="surname">
                </div>
                <div class="form-group">
                    <label for="gender">Gender:</label>
                    <select class="form-control" id="gender" name="gender">
                        <option value="MALE">Male</option>
                        <option value="FEMALE">Female</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-default">Add</button>
            </form>
        </div>
    </div>

""")))}),format.raw/*33.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 24 07:59:45 GMT 2015
                  SOURCE: /Users/Rocky/Documents/projects/github/scala-form-with-enum/app/views/index.scala.html
                  HASH: 0bcf434d0778c2d60482e324875fce528d20b9ea
                  MATRIX: 505->1|610->18|638->21|669->44|708->46|739->51|906->192|920->198|966->224|2178->1406
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|28->7|28->7|28->7|54->33
                  -- GENERATED --
              */
          