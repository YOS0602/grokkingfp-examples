package mine

object ch02_TestingPureFunctions extends App {
  def increment(x: Int): Int = {
    x + 1
  }

  assert(increment(0) == 1)
  assert(increment(-10) == -9)
  assert(increment(Int.MaxValue - 1) == Int.MaxValue)

  def add(a: Int, b: Int): Int = {
    a + b
  }

  assert(add(0, 1) == 1)
  assert(add(-1, 1) == 0)

  def wordScore(word: String): Int = {
    word.replaceAll("a", "").length
  }

  assert(wordScore("Hello") == 5)
  assert(wordScore("Scala") == 3)
  assert(wordScore("") == 0)
}
// sbt 'runMain mine.ch02_TestingPureFunctions'
