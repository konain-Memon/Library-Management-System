import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added: " + book.getTitle());
    }

    public void registerMember(Member m) {
        members.add(m);
        System.out.println("Member Registered: " + m.getName());
    }

    public Book searchById(String id) {
        for (Book b : books) {
            if (b.getBookId().equals(id)) return b;
        }
        return null;
    }

    public Member searchMember(String id) {
        for (Member m : members) {
            if (m.getMemberId().equals(id)) return m;
        }
        return null;
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Yet");
            return;
        }

        for (Book b : books) b.display();
    }
}