public class Transaction {
    private Book book;
    private Memeber member;

    public Transaction(Book book, Member member) {
        this.book = book;
        this. member= member;
        book.setAvailable(false);Book(book);
        member.borrow
    }

    public Book getBook() {
        return book;
    }
    public void returnBook() {
        book.setAvailable(true);
        member.returnBook(book);
        System.out.println("Book Returned:" + book.getTitle());

    }
    
}