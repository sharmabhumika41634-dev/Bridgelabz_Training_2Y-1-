package Assignment;
import java.util.Scanner;
public class MovieManagementSystem {
    static class Node {
        String title, director;
        int year;
        double rating;
        Node prev, next;

        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }

    static Node head = null, tail = null;

    static void addEnd(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    static void addBeginning(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    static void addPosition(String title, String director, int year,
                            double rating, int pos) {
        if (pos <= 1 || head == null) {
            addBeginning(title, director, year, rating);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    static void removeMovie(String title) {
        Node temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found");
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

        System.out.println("Movie removed");
    }

    static void searchDirector(String director) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println(temp.title + " " + temp.year
                        + " " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Movie not found");
        }
    }

    static void searchRating(double rating) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                System.out.println(temp.title + " " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No matching movies");
        }
    }

    static void updateRating(String title, double rating) {
        Node temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = rating;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    static void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director
                    + " | " + temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    static void displayReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director
                    + " | " + temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Beginning");
            System.out.println("2. Add End");
            System.out.println("3. Add Position");
            System.out.println("4. Remove Movie");
            System.out.println("5. Search Director");
            System.out.println("6. Search Rating");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("9. Update Rating");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Director: ");
                    String director = sc.nextLine();

                    System.out.print("Year: ");
                    int year = sc.nextInt();

                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();

                    if (choice == 1) {
                        addBeginning(title, director, year, rating);
                    } else if (choice == 2) {
                        addEnd(title, director, year, rating);
                    } else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        addPosition(title, director, year, rating, pos);
                    }
                    break;

                case 4:
                    System.out.print("Enter title: ");
                    removeMovie(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Enter director: ");
                    searchDirector(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Minimum rating: ");
                    searchRating(sc.nextDouble());
                    break;

                case 7:
                    displayForward();
                    break;

                case 8:
                    displayReverse();
                    break;

                case 9:
                    System.out.print("Enter title: ");
                    String t = sc.nextLine();

                    System.out.print("New rating: ");
                    updateRating(t, sc.nextDouble());
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
