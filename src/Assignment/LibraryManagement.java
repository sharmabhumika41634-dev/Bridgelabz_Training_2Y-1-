package Assignment;
import java.util.Scanner;
public class LibraryManagement {
    static class Node {
        int id;
        String title, author, genre;
        boolean available;
        Node prev, next;

        Node(int id, String title, String author,
             String genre, boolean available) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.available = available;
        }
    }

    static Node head = null, tail = null;

    static void addEnd(int id, String title, String author,
                       String genre, boolean available) {
        Node newNode = new Node(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    static void addBeginning(int id, String title, String author,
                             String genre, boolean available) {
        Node newNode = new Node(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    static void addPosition(int id, String title, String author,
                            String genre, boolean available, int pos) {
        if (pos <= 1 || head == null) {
            addBeginning(id, title, author, genre, available);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(id, title, author, genre, available);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    static void removeBook(int id) {
        Node temp = head;

        while (temp != null && temp.id != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }

        System.out.println("Book removed");
    }

    static void search(String key) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key)
                    || temp.author.equalsIgnoreCase(key)) {
                System.out.println(temp.id + " " + temp.title
                        + " " + temp.author + " " + temp.genre);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    static void updateAvailability(int id, boolean status) {
        Node temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.available = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    static void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.title
                    + " " + temp.author + " " + temp.genre
                    + " Available: " + temp.available);
            temp = temp.next;
        }
    }

    static void displayReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.title
                    + " " + temp.author);
            temp = temp.prev;
        }
    }

    static void countBooks() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Beginning");
            System.out.println("2. Add End");
            System.out.println("3. Add Position");
            System.out.println("4. Remove Book");
            System.out.println("5. Search Book");
            System.out.println("6. Update Availability");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("9. Count Books");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Available? true/false: ");
                    boolean available = sc.nextBoolean();

                    if (choice == 1) {
                        addBeginning(id, title, author, genre, available);
                    } else if (choice == 2) {
                        addEnd(id, title, author, genre, available);
                    } else {
                        System.out.print("Position: ");
                        addPosition(id, title, author, genre,
                                available, sc.nextInt());
                    }
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    removeBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Title or Author: ");
                    search(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Book ID: ");
                    int bookId = sc.nextInt();

                    System.out.print("Available? true/false: ");
                    updateAvailability(bookId, sc.nextBoolean());
                    break;

                case 7:
                    displayForward();
                    break;

                case 8:
                    displayReverse();
                    break;

                case 9:
                    countBooks();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
