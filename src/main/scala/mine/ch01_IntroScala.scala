package mine

def increment(x: Int): Int = {
  x + 1
}

def getFirstCharacter(s: String): Char = {
  s.charAt(0)
}

def wordScore(word: String): Int = {
  word.length()
}

object ch01_IntroScala extends App {
  println(increment(3))
  println(getFirstCharacter("Scala"))
  println(wordScore("Scala"))
}
// sbt 'runMain mine.ch01_IntroScala'
