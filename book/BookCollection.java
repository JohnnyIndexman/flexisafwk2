package book;
import java.util.ArrayList;

class BookCollection {
    private ArrayList<Book> books;

    // Constructor to initialize the collection
    public BookCollection() {
        books = new ArrayList<>();
    }

    // Method to add a book to the collection
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to remove a book from the collection
    public void removeBook(int ISBN) {
        for (Book book : books) {
            if (book.getISBN() == ISBN) {
                books.remove(book);
                System.out.println("Book removed: " + book);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    // Method to display all books in the collection
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

