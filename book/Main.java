package book;

public class Main {
    public static void main(String[] args) {
        // Create a new book collection
        BookCollection collection = new BookCollection();

        // Add books to the collection
        Book book1 = new Book("A Gold Fish Has No Hiding Place", "James Hardley Chase", 1234);
        Book book2 = new Book("Angels and Demons", "Dan Brown", 5678);
        Book book3 = new Book("The Alchemist", "Paulo Coelho", 9101);

        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);

        // Display all books
        collection.displayBooks();

        // Remove a book by ISBN
        collection.removeBook(5678);

        // Display all books after removal
        collection.displayBooks();
    }
}
