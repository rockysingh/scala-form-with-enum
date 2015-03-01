package models

import enum.Gender.Gender
import play.api.libs.json.Json

case class Person(email: String, firstname: String, surname: String, gender: Gender) {

}

object Person {
  implicit val personFormat = Json.format[Person]
}