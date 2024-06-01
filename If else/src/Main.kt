import kotlin.random.Random  // Import the Random class from the Kotlin standard library

fun main() {  // Define the main function, the entry point of the program
    println("Welcome to the Number Guessing Game!")  // Print a welcome message to the user
    println("I've selected a random number between 1 and 100. Can you guess it?")  // Inform the user about the game

    val secretNumber = Random.nextInt(1, 101)  // Generate a random number between 1 and 100 and store it in the variable secretNumber
    var attempts = 0  // Initialize a variable attempts to keep track of the number of guesses

    guessNumber(secretNumber, attempts)  // Call the guessNumber function with the secret number and the initial number of attempts
}

fun guessNumber(secretNumber: Int, attempts: Int) {  // Define the guessNumber function that takes the secret number and the current number of attempts as parameters
    if (attempts >= 5) {  // Check if the user has reached the maximum number of attempts
        println("You've reached the maximum number of attempts. The secret number was $secretNumber.")  // Inform the user that they've reached the maximum number of attempts and reveal the secret number
        return  // Exit the function
    }

    print("Enter your guess: ")  // Prompt the user to enter their guess
    val guess = readLine()?.toIntOrNull()  // Read the user's input and convert it to an integer, storing it in the variable guess

    if (guess == null) {  // Check if the user's input is not a valid number
        println("Invalid input. Please enter a valid number.")  // Inform the user that their input is invalid
        guessNumber(secretNumber, attempts)  // Call the guessNumber function again with the same number of attempts
        return  // Exit the function
    }

    if (guess < secretNumber) {  // Check if the user's guess is less than the secret number
        println("Too low! Try again.")  // Inform the user that their guess is too low
        guessNumber(secretNumber, attempts + 1)  // Call the guessNumber function again with an incremented number of attempts
    } else if (guess > secretNumber) {  // Check if the user's guess is greater than the secret number
        println("Too high! Try again.")  // Inform the user that their guess is too high
        guessNumber(secretNumber, attempts + 1)  // Call the guessNumber function again with an incremented number of attempts
    } else {  // If the user's guess is equal to the secret number
        println("Congratulations! You guessed the correct number in ${attempts + 1} attempts.")  // Congratulate the user and show the number of attempts taken
    }
}
