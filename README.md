# Book Collection Manager
This Java mini-project demonstrates how to manage a collection of books using object-oriented principles. The project includes classes to represent books and a collection manager to add, remove, and display books.

## Features
Add books to the collection.
Remove books from the collection by ISBN.
Display all books in the collection.

## Structure
### 1. Classes
Book:
Attributes: title, author, ISBN.
Methods: Getters, toString for book details.
BookCollection:
Maintains a collection of books using ArrayList<Book>.
Methods:
addBook(Book book)
removeBook(int ISBN)
displayBooks()
### 2. Main Class
Demonstrates functionality by adding, removing, and displaying books.

## How to Run
Compile the program:
javac Main.java
Run the program:
java Main

## Technologies Used
Java SE
Collections (ArrayList)
