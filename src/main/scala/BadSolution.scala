object BadSolution {
  def fizzbuzz(number: Int): Unit = if (number % 3 == 0 && number % 5 == 0) {
    println("fizzbuzz")
  } else if (number % 3 == 0) {
    println("fizz")
  } else if (number % 5 == 0) {
    println("buzz")
  } else {
    println(number.toString)
  }
}
