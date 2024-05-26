<h2>Write a Kotlin program in Android Studio to:</h2>
<p style="font-size: 16px;"> 
1. Create two arrays:
<br>   - First names.
<br>   - Corresponding last names.

<br>2. Create a third array containing full names by concatenating the first and last names.

<br>3. Use the following names:

<br>First Names:
<br>- James, Joseph, Art, Len, Don, Sima, Mitsue, Leo, Sage, Krish, Minna, Abe, Kyle, Graciela, Cammi, Matt, Mel, Glady, Yukee

<br>Last Names:
<br>- Bhatt, Darakjy, Veere, Paprocki, Foller, Morasca, Toll, Dilli, Wiezer, Marrier, Amigo, Maclead, Caldarera, Roota, Albares, Poquette, Garufi, Rim, Whobrey

<br>4. Print all three arrays (first names, last names, full names).

<br>5. Share your program and a screenshot of the output.
</p>

<h2>Answers:</h2>
<p style="font-size: 20px;">The full code in "array_and_list.kt" File</p>
<h3> 1. Arrays of First Names and Last Names</h3>
<p>
The code starts by defining two arrays, one for first names and one for last names.
<br>```kotlin</p>
<code class ="language-kotlin">
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
)</code>
```

- `val` is used to declare a read-only variable.
- `arrayOf(...)` creates an array containing the listed elements.
- `firstNames` and `lastNames` are arrays holding first names and last names respectively.

### 2. Creating Full Names

Next, the code creates a new array called `fullNames` which combines each first name with a corresponding last name.

```kotlin
val fullNames = Array(firstNames.size) { i ->
    "${firstNames[i]} ${lastNames[i]}"
}
```

- `Array(firstNames.size) { i -> ... }` creates a new array with the same size as `firstNames`.
- `i` is the index of the current element being processed.
- `"${firstNames[i]} ${lastNames[i]}"` creates a string that combines the `i`-th element of `firstNames` and `lastNames` with a space in between.
- For example, if `i` is 0, it combines `firstNames[0]` ("James") with `lastNames[0]` ("Bhatt") to make "James Bhatt".

### 3. Printing the Arrays

Finally, the code prints out the first names, last names, and full names.

```kotlin
println("First Names:")
println(firstNames.joinToString(", "))
println("\nLast Names:")
println(lastNames.joinToString(", "))
println("\nFull Names:")
println(fullNames.joinToString(", "))
```

- `println(...)` prints a line of text to the console.
- `joinToString(", ")` converts an array to a single string, with each element separated by ", ".
- `\n` is a newline character, which moves the output to the next line.

### Summary

1. **Arrays Creation**:
   - `firstNames` and `lastNames` arrays are created to hold names.
2. **Combining Names**:
   - `fullNames` array is created by combining elements from `firstNames` and `lastNames`.
3. **Printing**:
   - The arrays are printed to the console in a readable format.

<h3> Example Output </h3>

The output of this code would look like this:

```
First Names:
James, Joseph, Art, Len, Don, Sima, Mitsue, Leo, Sage, Krish, Minna, Abe, Kyle, Graciela, Cammi, Matt, Mel, Glady

Last Names:
Bhatt, Darakjy, Veere, Paprocki, Foller, Morasca, Toll, Dilli, Wiezer, Marrier, Amigo, Maclead, Caldarera, Roota, Albares, Poquette, Garufi, Rim

Full Names:
James Bhatt, Joseph Darakjy, Art Veere, Len Paprocki, Don Foller, Sima Morasca, Mitsue Toll, Leo Dilli, Sage Wiezer, Krish Marrier, Minna Amigo, Abe Maclead, Kyle Caldarera, Graciela Roota, Cammi Albares, Matt Poquette, Mel Garufi, Glady Rim
```

This shows how the code combines the first and last names and prints them neatly.
