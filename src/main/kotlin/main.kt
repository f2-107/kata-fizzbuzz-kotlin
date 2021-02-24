fun main() {
    var input: Int

    do {
        print("Enter an integer from 1-1000: > ")
        input = readLine()!!.toInt()

        if (input < 1 || input > 1000) println("\nError - invalid input")
    } while (input < 1|| input > 1000)

    for (i in 1 until input + 1) {
        println("${i.toString().padStart(4, '0')}: ${fizzBuzz(i)}")
    }
}

fun fizzBuzz(valueToCheck: Int): String {
    when {
        valueToCheck % 15 == 0 -> return "FizzBuzz"
        valueToCheck % 3 == 0 -> return "Fizz"
        valueToCheck % 5 == 0 -> return "Buzz"
        else -> return valueToCheck.toString()
    }
}
