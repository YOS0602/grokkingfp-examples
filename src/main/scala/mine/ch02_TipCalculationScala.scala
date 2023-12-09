package mine

object TipCalculator {
  def getTipPercentage(names: List[String]): Int = {
    if (names.size > 5) 20
    else if (names.size > 0) 10
    else 0
  }
}

object ch02_TipCalculationScala extends App {
  assert(TipCalculator.getTipPercentage(List.empty) == 0)
  assert(TipCalculator.getTipPercentage(List("A", "B", "C", "D", "E")) == 10)
  assert(TipCalculator.getTipPercentage(List("A", "B", "C", "D", "E", "F")) == 20)
}
// sbt 'runMain mine.ch02_TipCalculationScala'
