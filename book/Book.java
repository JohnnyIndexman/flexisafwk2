package book;


class Book {
    private String title;
    private String author;
    private int ISBN;

    // Constructor
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    // toString method for displaying book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}