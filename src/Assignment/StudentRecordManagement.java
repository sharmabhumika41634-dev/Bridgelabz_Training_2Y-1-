package Assignment;
import java.util.Scanner;
public class StudentRecordManagement {
    static class Node {
        int rollNo, age;
        String name, grade;
        Node next;

        Node(int rollNo, String name, int age, String grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
            next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    static void addBeginning(int roll, String name, int age, String grade) {
        Node newNode = new Node(roll, name, age, grade);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    static void addEnd(int roll, String name, int age, String grade) {
        Node newNode = new Node(roll, name, age, grade);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    static void addPosition(int roll, String name, int age,
                            String grade, int position) {
        if (position <= 1 || head == null) {
            addBeginning(roll, name, age, grade);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(roll, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    static void deleteStudent(int roll) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == roll) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            System.out.println("Student deleted");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.rollNo != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;
            }

            System.out.println("Student deleted");
        }
    }

    static void searchStudent(int roll) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    static void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("No student records");
            return;
        }

        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name
                    + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    static void updateGrade(int roll, String grade) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                temp.grade = grade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Beginning");
            System.out.println("2. Add End");
            System.out.println("3. Add Position");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Display Students");
            System.out.println("7. Update Grade");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    if (choice == 1) {
                        addBeginning(roll, name, age, grade);
                    } else if (choice == 2) {
                        addEnd(roll, name, age, grade);
                    } else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        addPosition(roll, name, age, grade, pos);
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No: ");
                    deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Roll No: ");
                    searchStudent(sc.nextInt());
                    break;

                case 6:
                    display();
                    break;

                case 7:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Grade: ");
                    String g = sc.nextLine();

                    updateGrade(r, g);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
