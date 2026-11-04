package LinkedList.Basic.Linklist.doubly;

public class BASICS {
    public static class Node {

            int data;
            Node next;
            Node prev;

            public Node(int data) {
                this.data = data;
            }
        }

        public static Node head;
        public static Node tail;

        // Display
        public static void display() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }

            System.out.println("null");
        }

        // Insert At First
        public static void insertAtFirst(int value) {

            Node temp = new Node(value);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }

        // Insert At Last
        public static void insertAtLast(int value) {

            Node temp = new Node(value);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }

        // Main Method
        public static void main(String[] args) {

            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);

            head = a;
            tail = d;

            a.prev = null;
            a.next = b;

            b.prev = a;
            b.next = c;

            c.prev = b;
            c.next = d;

            d.prev = c;
            d.next = null;

            System.out.println("Original Linked List:");
            display();

            insertAtFirst(5);

            System.out.println("After Insert At First:");
            display();

            insertAtLast(50);

            System.out.println("After Insert At Last:");
            display();
        }
    }
