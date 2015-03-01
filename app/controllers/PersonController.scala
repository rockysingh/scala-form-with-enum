package controllers

import mapping.mapping.GenderMapping
import models.Person
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

object PersonController extends Controller {

  val personForm : Form[Person] = Form {
    mapping(
      "email" -> nonEmptyText,
      "firstname" -> nonEmptyText,
      "surname" -> nonEmptyText,
      "gender" -> GenderMapping.genderType
    )(Person.apply)(Person.unapply)
  }

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def create = Action { implicit request =>
     val person = personForm.bindFromRequest.get
     Ok(Json.toJson(person))
  }


}
