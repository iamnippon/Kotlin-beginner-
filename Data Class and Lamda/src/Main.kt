// TIP: To Run code, press the Run button or click the execute icon in the gutter.

data class Book(val title: String, val author: String, val year: Int, val rating: Double)  // Define a data class Book with properties: title, author, year, and rating

val books = listOf(  // Create a list of Book objects
    Book("1984", "George Orwell", 1949, 4.9),  // Add a book with title "1984", author "George Orwell", year 1949, and rating 4.9
    Book("To Kill a Mockingbird", "Harper Lee", 1960, 4.8),  // Add a book with title "To Kill a Mockingbird", author "Harper Lee", year 1960, and rating 4.8
    Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 4.7),  // Add a book with title "The Great Gatsby", author "F. Scott Fitzgerald", year 1925, and rating 4.7
    Book("Pride and Prejudice", "Jane Austen", 1813, 4.6),  // Add a book with title "Pride and Prejudice", author "Jane Austen", year 1813, and rating 4.6
    Book("The Catcher in the Rye", "J.D. Salinger", 1951, 4.5)  // Add a book with title "The Catcher in the Rye", author "J.D. Salinger", year 1951, and rating 4.5
)

// Extension function on Book to return information about the book
fun Book.info() = "Title: $title, Author: $author, Year: $year, Rating: $rating"

// Extension function on List<Book> to get books by a specific author
fun List<Book>.getBooksByAuthor(author: String) = this.filter { it.author == author }

fun main() {  // Define the main function, the entry point of the program
    // Filtering books with rating greater than 4.7
    val highRatedBooks = books.filter { it.rating > 4.7 }
    println("High rated books: $highRatedBooks")  // Print high-rated books

    // Mapping books to their titles
    val bookTitles = books.map { it.title }
    println("Book titles: $bookTitles")  // Print book titles

    // Calculating the average rating of the books
    val averageRating = books.map { it.rating }.average()
    println("Average rating: $averageRating")  // Print the average rating

    // Print information for each book using the info extension function
    //Hint: Use forEach to iterate over the books and print the information of each book
    books.forEach { println(it.info()) }

    // Get books by a specific author using the getBooksByAuthor extension function
    val orwellBooks = books.getBooksByAuthor("George Orwell")
    println("Books by George Orwell: $orwellBooks")  // Print books by George Orwell
}
