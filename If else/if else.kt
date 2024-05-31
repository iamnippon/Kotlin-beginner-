import kotlin.random.Random

fun main() {
    println("Welcome to the Number Guessing Game!")
    println("I've selected a random number from 1 to 100. Can you guess it?")

    val secretNumber = Random.nextInt(1, 101)
    var attempts = 0

    guessNumber(secretNumber, attempts)
}

fun guessNumber(secretNumber: Int, attempts: Int) {
    if (attempts >= 5) {
        println("You've reached the maximum number of attempts. The secret number was $secretNumber.")
        return
    }

    print("Enter your guess: ")
    val guess = readLine()?.toIntOrNull()

    if (guess == null) {
        println("Invalid input. Please enter a valid number.")
        guessNumber(secretNumber, attempts)
        return
    }

    if (guess < secretNumber) {
        println("Too low! Try again.")
        guessNumber(secretNumber, attempts + 1)
    } else if (guess > secretNumber) {
        println("Too high! Try again.")
        guessNumber(secretNumber, attempts + 1)
    } else {
        println("Congratulations! You guessed the correct number in ${attempts + 1} attempts.")
    }
}
