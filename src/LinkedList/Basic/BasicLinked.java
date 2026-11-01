package LinkedList.Basic;

public class BasicLinked {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        System.out.print(a.data + " ->");
        System.out.print(b.data + " ->");
        System.out.print(c.data + " ->");
        System.out.print(d.data + " ->");
        System.out.print(e.data + " ->");


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.print(a.data + " ->");

        System.out.println();
        System.out.println("Trick 2");
        System.out.print(a.data + " ->");
        System.out.print(a.next.next.data + " ->");
        System.out.print(a.next.next.next.data);
        System.out.println();
        System.out.println("Trick 3");
        Node temp = a;
        for (int i = 0; i < 5; i++) {
            if (temp != null) {
                System.out.print(temp.data + " ->");
                temp = temp.next;
            }
        }
        System.out.println("null");

    }
}












