import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. List Books");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    lib.addBook(new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter user name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter user ID: ");
                    String userId = sc.nextLine();
                    lib.registerUser(new User(name, userId));
                    break;

                case 3:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    System.out.print("Enter user ID: ");
                    String issueUser = sc.nextLine();
                    lib.issueBook(issueTitle, issueUser);
                    break;

                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    lib.returnBook(returnTitle);
                    break;

                case 5:
                    lib.listBooks();
                    break;

                case 6:
                    System.out.println("Exiting system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
