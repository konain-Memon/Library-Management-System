public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public void display() {
        System.out.println(bookId + " | " + title + " by " + author + " | Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book b1 = new Book("101", "Java Programming", "James");
        b1.display();
    }
}