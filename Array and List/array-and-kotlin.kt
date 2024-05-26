fun main() {
    val firstNames = arrayOf(
        "James", "Joseph", "Art", "Len", "Don",
        "Sima", "Mitsue", "Leo", "Sage", "Krish",
        "Minna", "Abe", "Kyle", "Graciela", "Cammi",
        "Matt", "Mel", "Glady"
    )
    val lastNames = arrayOf(
        "Bhatt", "Darakjy", "Veere", "Paprocki", "Foller",
        "Morasca", "Toll", "Dilli", "Wiezer", "Marrier",
        "Amigo", "Maclead", "Caldarera", "Roota", "Albares",
        "Poquette", "Garufi", "Rim"
    ) 

    val fullNames = Array(firstNames.size) { i ->
        "${firstNames[i]} ${lastNames[i]}"
    }

    println("First Names:")
    println(firstNames.joinToString(", "))
    println("\nLast Names:")
    println(lastNames.joinToString(", "))
    println("\nFull Names:")
    println(fullNames.joinToString(", "))
}
