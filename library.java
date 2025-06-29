import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user);
    }

    public void issueBook(String title, String userId) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued to " + userId + ": " + title);
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void listBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
