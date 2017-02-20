package sw

/**
  * Created by hakjoongkim on 2/18/17.
  */
trait State {
  def accept (input: String): State
}

object State{

  def initial: State = Travelport

  case object Travelport extends State {
    override def accept(input: String): State = input match {
      case "work" => Google
      case _ => this
    }
  }

  case object Google extends State {
    override def accept(input: String): State = input match {
      case "great" => Travelport
      case _ => this
    }
  }
}