data class Book(val title: String, val author: String, val year: Int, val rating: Double)

val books = listOf(
    Book("1984", "George Orwell", 1949, 4.9),
    Book("To Kill a Mockingbird", "Harper Lee", 1960, 4.8),
    Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 4.7),
    Book("Pride and Prejudice", "Jane Austen", 1813, 4.6),
    Book("The Catcher in the Rye", "J.D. Salinger", 1951, 4.5)
)

// Extension function on Book
fun Book.info() = "Title: $title, Author: $author, Year: $year, Rating: $rating"

// Extension function on List<Book>
fun List<Book>.getBooksByAuthor(author: String) = this.filter { it.author == author }

fun main() {
    // Filtering
    val highRatedBooks = books.filter { it.rating > 4.7 }
    println("High rated books: $highRatedBooks")

    // Mapping
    val bookTitles = books.map { it.title }
    println("Book titles: $bookTitles")

    // Folding
    val averageRating = books.map { it.rating }.average()
    println("Average rating: $averageRating")

    // Print information for each book using the extension function
    books.forEach { Dprintln(it.info()) }

    // Get books by a specific author using the extension function
    val orwellBooks = books.getBooksByAuthor("George Orwell")
    println("Books by George Orwell: $orwellBooks")
}
