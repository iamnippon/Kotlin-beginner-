fun main() {  // Define the main function, the entry point of the program
    val firstNames = arrayOf(  // Create an array of first names
        "James", "Joseph", "Art", "Len", "Don",
        "Sima", "Mitsue", "Leo", "Sage", "Krish",
        "Minna", "Abe", "Kyle", "Graciela", "Cammi",
        "Matt", "Mel", "Glady"
    )
    val lastNames = arrayOf(  // Create an array of last names
        "Bhatt", "Darakjy", "Veere", "Paprocki", "Foller",
        "Morasca", "Toll", "Dilli", "Wiezer", "Marrier",
        "Amigo", "Maclead", "Caldarera", "Roota", "Albares",
        "Poquette", "Garufi", "Rim"
    )

    val fullNames = Array(firstNames.size) { i ->  // Create an array of full names by combining first and last names
        "${firstNames[i]} ${lastNames[i]}"  // Combine the i-th elements of firstNames and lastNames arrays
    }

    println("First Names:")  // Print a heading for the first names
    println(firstNames.joinToString(", "))  // Print all first names, separated by commas
    println("\nLast Names:")  // Print a heading for the last names, followed by a newline for separation
    println(lastNames.joinToString(", "))  // Print all last names, separated by commas
    println("\nFull Names:")  // Print a heading for the full names, followed by a newline for separation
    println(fullNames.joinToString(", "))  // Print all full names, separated by commas
}
