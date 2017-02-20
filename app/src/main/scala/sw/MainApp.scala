package sw

/**
  * Created by hakjoongkim on 2/19/17.
  */
object MainApp extends App {
  scala.io.Source
    List("great","great","work")
        .map(_.trim)
    .scanLeft(State.initial)(_.accept(_))
    .foreach(println)
}
