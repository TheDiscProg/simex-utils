import sbt.*

object Dependencies {

  lazy val all = Seq(
    "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )
}
