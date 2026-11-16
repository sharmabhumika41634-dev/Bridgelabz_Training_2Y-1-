package Assignment;
import java.util.Scanner;

public class UndoRedoTextEditor {
    static class Node {
        String text;
        Node prev, next;

        Node(String text) {
            this.text = text;
        }
    }

    static Node head = null, tail = null, current = null;
    static int count = 0;

    static void addState(String text) {
        if (current != null && current.next != null) {
            current.next = null;
            tail = current;
            count = 0;

            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }

        Node newNode = new Node(text);

        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = newNode;
        }

        count++;

        while (count > 10) {
            head = head.next;
            head.prev = null;
            count--;
        }

        System.out.println("Text saved");
    }

    static void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful");
        } else {
            System.out.println("Nothing to undo");
        }
    }

    static void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo successful");
        } else {
            System.out.println("Nothing to redo");
        }
    }

    static void displayCurrent() {
        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println("Current Text: " + current.text);
        }
    }

    static void displayHistory() {
        Node temp = head;

        System.out.println("History:");

        while (temp != null) {
            if (temp == current) {
                System.out.println("-> " + temp.text + " (Current)");
            } else {
                System.out.println(temp.text);
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add New Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current Text");
            System.out.println("5. Display History");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter Text: ");
                    addState(sc.nextLine());
                    break;

                case 2:
                    undo();
                    break;

                case 3:
                    redo();
                    break;

                case 4:
                    displayCurrent();
                    break;

                case 5:
                    displayHistory();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
