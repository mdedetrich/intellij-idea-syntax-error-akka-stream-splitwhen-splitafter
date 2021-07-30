import akka.stream.scaladsl.Source

object AkkaStreamSyntaxExample {
  val source: Source[Int, Int] = ???

  // Intellij reports this incorrectly as a syntax error but it compiles
  // fine with Scala 2.13.6
  source.splitAfter { case i => i % 2 == 0 }

  // Same issue also occurs with splitWhen
  source.splitWhen { case i => i % 2 == 0 }

}
