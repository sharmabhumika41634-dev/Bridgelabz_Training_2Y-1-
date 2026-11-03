package LinkedList.Basic.Travers;

import LinkedList.Basic.Node;

public class Traversal {
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

    // Display
    public static void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }


    }
    public static void countNodes() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        System.out.println(count);
    }
    public static void insertAtStart(int value){
        Node temp=new Node(value);
        if(head==null){
            head=temp;
            tail=temp;
        }else {
            head.next=temp;
            head=temp;
        }

    }

    public static void main(String[] args) {
        insertAtStart(5);
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);

        display();
        System.out.println();
        countNodes();
    }
}