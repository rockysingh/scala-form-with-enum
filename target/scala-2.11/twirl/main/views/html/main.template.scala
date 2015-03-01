
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap/css/bootstrap.min.css")),format.raw/*9.117*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/hello.js")),format.raw/*11.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.11.1.min.js")),format.raw/*12.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("stylesheets/bootstrap/js/bootstrap.min.js")),format.raw/*13.84*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*16.10*/content),format.raw/*16.17*/("""
    """),format.raw/*17.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 24 07:58:28 GMT 2015
                  SOURCE: /Users/Rocky/Documents/projects/github/scala-form-with-enum/app/views/main.scala.html
                  HASH: 6e1d3a4158254341dd2520a1d348c679184a9506
                  MATRIX: 509->1|627->31|655->33|732->84|757->89|845->151|859->157|913->191|995->247|1009->253|1087->310|1175->371|1190->377|1243->409|1295->434|1310->440|1365->474|1449->531|1464->537|1531->583|1615->640|1630->646|1706->701|1800->768|1828->775|1860->780
                  LINES: 19->1|22->1|24->3|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|37->16|37->16|38->17
                  -- GENERATED --
              */
          