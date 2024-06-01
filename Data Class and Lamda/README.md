## Data Class and Lambda Function
Let's create a fun project called "Kotlin Fun with Functional Programming". In this project, we will build a simple application that manages a list of books. We will use functional programming concepts, lambda expressions, collections and operations, and extension functions to manipulate and display book information.

### Project Overview

The project will:
1. Define a `Book` data class.
2. Use collections to manage a list of books.
3. Use lambda expressions to filter, map, and fold collections.
4. Define and use extension functions to add functionality to the `Book` class and collections.

### Step-by-Step Implementation

#### 1. Define the `Book` Data Class

First, let's define a simple `Book` data class with properties for the title, author, year of publication, and rating.

```kotlin
data class Book(val title: String, val author: String, val year: Int, val rating: Double)
```

#### 2. Initialize a List of Books

Next, we will create a list of books to work with.

```kotlin
val books = listOf(
    Book("1984", "George Orwell", 1949, 4.9),
    Book("To Kill a Mockingbird", "Harper Lee", 1960, 4.8),
    Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 4.7),
    Book("Pride and Prejudice", "Jane Austen", 1813, 4.6),
    Book("The Catcher in the Rye", "J.D. Salinger", 1951, 4.5)
)
```

#### 3. Use Lambda Expressions and Collection Operations

We will use lambda expressions and collection operations to filter, map, and fold the list of books.

- **Filtering**: Find all books with a rating above 4.7.
- **Mapping**: Create a list of book titles.
- **Folding**: Calculate the average rating of all books.

```kotlin
// Filtering
val highRatedBooks = books.filter { it.rating > 4.7 }
println("High rated books: $highRatedBooks")

// Mapping
val bookTitles = books.map { it.title }
println("Book titles: $bookTitles")

// Folding
val averageRating = books.map { it.rating }.average()
println("Average rating: $averageRating")
```

#### 4. Define and Use Extension Functions

We will define extension functions to add functionality to the `Book` class and collections.

- **Extension Function on `Book`**: A function to display a book's information.
- **Extension Function on `List<Book>`**: A function to get books by a specific author.

```kotlin
// Extension function on Book
fun Book.info() = "Title: $title, Author: $author, Year: $year, Rating: $rating"

// Extension function on List<Book>
fun List<Book>.getBooksByAuthor(author: String) = this.filter { it.author == author }

fun main() {
    // Print information for each book using the extension function
    books.forEach { println(it.info()) }

    // Get books by a specific author using the extension function
    val orwellBooks = books.getBooksByAuthor("George Orwell")
    println("Books by George Orwell: $orwellBooks")
}
```


This project demonstrates functional programming in Kotlin with lambda expressions, collection operations, and extension functions. You can expand this project by adding more features, such as sorting books, finding books by year, or adding more extension functions for various purposes.
