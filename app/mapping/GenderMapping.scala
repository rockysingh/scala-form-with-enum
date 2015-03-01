package mapping

package mapping

import enum.Gender
import play.api.data.{FormError, Forms, Mapping}
import play.api.data.format.Formatter

object GenderMapping {

  implicit val appTypeFormatter = new Formatter[Gender.Gender] {

    override def bind(key: String, data: Map[String, String]): Either[Seq[FormError], Gender.Gender] = {
      data.get(key).map { value =>
        try {
          Right(Gender.withName(value))
        } catch {
          case e: NoSuchElementException => error(key, value + " is not a valid gender type")
        }
      }.getOrElse(error(key, "No gender type provided."))
    }

    private def error(key: String, msg: String) = Left(List(new FormError(key, msg)))

    override def unbind(key: String, value: Gender.Gender): Map[String, String] = {
      Map(key -> value.toString())
    }
  }

  def genderType: Mapping[Gender.Gender] = Forms.of[Gender.Gender]
}
