package Assignment;
import java.util.Scanner;
public class TaskScheduler {
    static class Node {
        int id, priority;
        String name, dueDate;
        Node next;

        Node(int id, String name, int priority, String dueDate) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    static Node head = null, tail = null, current = null;

    static void addEnd(int id, String name, int priority, String date) {
        Node newNode = new Node(id, name, priority, date);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            current = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    static void addBeginning(int id, String name, int priority, String date) {
        Node newNode = new Node(id, name, priority, date);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            current = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    static void addPosition(int id, String name, int priority,
                            String date, int pos) {
        if (pos <= 1 || head == null) {
            addBeginning(id, name, priority, date);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    static void removeTask(int id) {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }

        Node temp = head;
        Node previous = tail;

        do {
            if (temp.id == id) {
                if (temp == head && temp == tail) {
                    head = tail = current = null;
                } else {
                    previous.next = temp.next;

                    if (temp == head) {
                        head = temp.next;
                    }

                    if (temp == tail) {
                        tail = previous;
                    }

                    if (current == temp) {
                        current = temp.next;
                    }

                    tail.next = head;
                }

                System.out.println("Task removed");
                return;
            }

            previous = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found");
    }

    static void viewCurrent() {
        if (current == null) {
            System.out.println("No tasks");
            return;
        }

        System.out.println("Current Task: " + current.name);
        System.out.println("Next Task: " + current.next.name);
        current = current.next;
    }

    static void display() {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }

        Node temp = head;

        do {
            System.out.println(temp.id + " " + temp.name
                    + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    static void searchPriority(int priority) {
        if (head == null) return;

        Node temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println(temp.name + " " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("Task not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Beginning");
            System.out.println("2. Add End");
            System.out.println("3. Add Position");
            System.out.println("4. Remove Task");
            System.out.println("5. View Current and Next");
            System.out.println("6. Display Tasks");
            System.out.println("7. Search Priority");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Due Date: ");
                    String date = sc.nextLine();

                    if (choice == 1) {
                        addBeginning(id, name, priority, date);
                    } else if (choice == 2) {
                        addEnd(id, name, priority, date);
                    } else {
                        System.out.print("Position: ");
                        addPosition(id, name, priority, date, sc.nextInt());
                    }
                    break;

                case 4:
                    System.out.print("Task ID: ");
                    removeTask(sc.nextInt());
                    break;

                case 5:
                    viewCurrent();
                    break;

                case 6:
                    display();
                    break;

                case 7:
                    System.out.print("Priority: ");
                    searchPriority(sc.nextInt());
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
