import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name;
    String author;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Book: " + name);
        System.out.println("Author: " + author);
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addBook() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, name, author));

        System.out.println("Book Added");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available");
            return;
        }

        for (Book b : books) {
            b.display();
            System.out.println();
        }
    }

    static void updateBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Book b : books) {
            if (b.id == id) {

                System.out.print("Enter New Book Name: ");
                b.name = sc.nextLine();

                System.out.print("Enter New Author Name: ");
                b.author = sc.nextLine();

                System.out.println("Book Updated");
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    static void deleteBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                books.remove(b);
                System.out.println("Book Deleted");
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    updateBook();
                    break;

                case 4:
                    deleteBook();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}











