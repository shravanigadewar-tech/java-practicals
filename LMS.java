import java.util.*;

class Book
{
    int bookId;
    String title;
    boolean issued;

    Book(int bookId,String title)
    {
        this.bookId = bookId;
        this.title = title;
        this.issued = false;
    }
}

public class LMS
{
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("1 Add Book");
            System.out.println("2 Issue Book");
            System.out.println("3 Return Book");
            System.out.println("4 View Books");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    addBook();
                    break;

                case 2:
                    issueBook();
                    break;

                case 3:
                    returnBook();
                    break;

                case 4:
                    viewBooks();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }

    static void addBook()
    {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        books.add(new Book(id,title));
    }

    static void issueBook()
    {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for(Book b : books)
        {
            if(b.bookId == id && !b.issued)
            {
                b.issued = true;
                System.out.println("Book Issued");
                return;
            }
        }

        System.out.println("Book not available");
    }

    static void returnBook()
    {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for(Book b : books)
        {
            if(b.bookId == id && b.issued)
            {
                b.issued = false;
                System.out.println("Book Returned");
                return;
            }
        }

        System.out.println("Invalid Book ID");
    }

    static void viewBooks()
    {
        for(Book b : books)
        {
            System.out.println("Book ID: " + b.bookId);
            System.out.println("Title: " + b.title);
            System.out.println("Issued: " + b.issued);
            System.out.println("-------------------");
        }
    }
}