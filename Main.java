import java.util.*;

    public class Main {

        public static void main (String[] args) {

            Liabray liabrary = new Liabary();
            Liabrarian liabrarian = new Liabrarian();
             Scanner sc = new Scanner(System.in);

             liabrary.addBook(new Book("B101" , "DLD", "Thomas Floyd"));
             liabrary.addBook(new Book("B102" , "Epository Writing", "John Langan"));
             liabrary.addBook(new Book("B103" , "IOT", "Arshdeep Bahga"));
             liabrary.addBook(new Book("B104" , "C Programming ", "Denis Ritchie "));
             liabrary.addBook(new Book("B105" , "Java programming", "James Gosling"));
             liabrary.registerMember (new Member("M1", "Ali")):

             while  (true) {

                System.out.println("\n===== LIBRARY SYSTEM=====");
                System.out.println("1.  Add BOOK");
                System.out.println("2.  Show All Books");
                System.out.println("3.  Register Member");
                System.out.println("4.  Issue Book ");
                System.out.println("5.  Return Book");
                System.out.println("6.  Exit");
                System.out.println("Choice :");
                int ch = sc.nextInt();

                if (ch== 1){

                    System.out.println("Enter Book ID :");
                    Sring id = sc.nextLine();
                    System.out.println("Enter Title:");
                    String title = sc.nextLine();
                    System.out.println("Enter Auther :");
                    String auther = sc.nextLine();
                    liabrary.addBook(new Book (id , title, auther));

                }
                else if (ch== 2) {
                    liabrary.showAllBooks();

                }
                else if (ch== 3 ) {

                    System.out.println("Enter member ID:");
                    Sring mid = sc.nextLine();
                    System.out.println("Enter name:");
                    String name  = sc.nextLine();
                    liabrary.registerMemeber(new member(mid, name));
                }
                    else if (ch==4){
                        System.out.println("Enter member ID :");

                        String mid = sc.nextLine();
                        System.out.println("Enter book ID");
                        String bidd = sc.nextLine();
                        Member m = liabrary.searchById(bid);

                        if (m != null && b != null) {
                            liabrarian.issueBook(m, b);
                        }
                        else {
                        System.out.println("member or book not found !");
                        }
                         else if (ch == 5 ) {

                            System.out.println("enter book Id to return:");
                            String bid = sc.nextLine();
                             book b = liabrary.searchById(bid);

                             if (b != null) {

                                b.setAvailable(true);
                                System.out.println("book returned : " + b.getTitle());
                             }
                            else {
                                System.out.println("book not found !");

                             }
                         }
                         else if (ch == 6){
                            break;

                         }

                }

             }
                        sc.close();

                        System.out.println("project closed");
        }
           }