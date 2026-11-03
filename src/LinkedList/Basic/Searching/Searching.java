package LinkedList.Basic.Searching;

import LinkedList.Basic.Node;

public class Searching {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    // Insert At End
    public static void insertAtEnd(int value) {

        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // Insert At Start
    public static void insertAtStart(int value) {

        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    // Display
    public static void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Count Nodes
    public static void countNodes() {

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Nodes: " + count);
    }

    // Searching
    public static int search(int key) {

        Node temp = head;
        int position = 1;

        while (temp != null) {

            if (temp.data == key) {
                return position;
            }

            temp = temp.next;
            position++;
        }

        return -1;
    }

    // Find Middle
    public static void findMid() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow != null) {
            System.out.println("Middle Node: " + slow.data);
        } else {
            System.out.println("Linked List is Empty");
        }
    }

    // Main Method
    public static void main(String[] args) {

        insertAtStart(5);
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);

        display();

        countNodes();

        int key = 30;
        int result = search(key);

        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at Position: " + result);
        }

        findMid();
    }
}