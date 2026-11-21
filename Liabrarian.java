public class Liabrarian {

    public Transaction issueBook (Member member, Book book) {

        if(book.isAvailable() == false) {
            System.out.println("Book Not Available! ");
             return null;

        }
        System.out.println("issued" + book .getTitle() + "to" + member.getName());
         return new Transaction(book, memebr);
    }
    }
}