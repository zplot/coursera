package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    def father: Int = if (c == 0) 0 else pascal(c - 1, r - 1)
    def mother: Int = if (c == r) 0 else pascal(c, r - 1)
    if (c == 0 && r == 0) 1 else father + mother

  }

  /**
    * Exercise 2
    *
    */
  def balance(chars: List[Char]): Boolean = {
    def numeramos(s: List[Char]): List[(Int, Int)] = s match {
      case Nil => List[(Int, Int)]()
      case x :: xs => {
        if (x == '(' ) (cont, )

      }

    }

  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
