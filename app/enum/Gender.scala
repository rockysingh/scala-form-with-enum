package enum

import play.api.libs.json.{JsString, JsSuccess, JsValue, Format}

object Gender extends Enumeration {
    type Gender = Value
    val MALE, FEMALE = Value

    implicit val enumFormat = new Format[Gender] {
        def reads(json: JsValue) = JsSuccess(Gender.withName(json.as[String]))
        def writes(enum: Gender) = JsString(enum.toString)
    }
}
