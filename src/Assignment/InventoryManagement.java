package Assignment;

import java.util.Scanner;
public class InventoryManagement {
    static class Node {
        int id, quantity;
        String name;
        double price;
        Node next;

        Node(int id, String name, int quantity, double price) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    static Node head = null;

    static void addEnd(int id, String name, int quantity, double price) {
        Node newNode = new Node(id, name, quantity, price);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    static void addBeginning(int id, String name, int quantity, double price) {
        Node newNode = new Node(id, name, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    static void addPosition(int id, String name, int quantity,
                            double price, int pos) {
        if (pos <= 1 || head == null) {
            addBeginning(id, name, quantity, price);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(id, name, quantity, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void removeItem(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }

    static void updateQuantity(int id, int quantity) {
        Node temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = quantity;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }

    static void searchItem(String key) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(key)
                    || String.valueOf(temp.id).equals(key)) {
                System.out.println(temp.id + " " + temp.name
                        + " " + temp.quantity + " " + temp.price);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    static void totalValue() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.name
                    + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    static void sort(int choice) {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {

                int result = 0;

                if (choice == 1 || choice == 2) {
                    result = i.name.compareToIgnoreCase(j.name);
                } else {
                    result = Double.compare(i.price, j.price);
                }

                if ((choice == 2 || choice == 4) && result < 0
                        || (choice == 1 || choice == 3) && result > 0) {
                    int id = i.id;
                    String name = i.name;
                    int quantity = i.quantity;
                    double price = i.price;

                    i.id = j.id;
                    i.name = j.name;
                    i.quantity = j.quantity;
                    i.price = j.price;

                    j.id = id;
                    j.name = name;
                    j.quantity = quantity;
                    j.price = price;
                }
            }
        }

        System.out.println("Items sorted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Beginning");
            System.out.println("2. Add End");
            System.out.println("3. Add Position");
            System.out.println("4. Remove Item");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search Item");
            System.out.println("7. Total Inventory Value");
            System.out.println("8. Display");
            System.out.println("9. Sort by Name Ascending");
            System.out.println("10. Sort by Name Descending");
            System.out.println("11. Sort by Price Ascending");
            System.out.println("12. Sort by Price Descending");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    if (choice == 1) {
                        addBeginning(id, name, quantity, price);
                    } else if (choice == 2) {
                        addEnd(id, name, quantity, price);
                    } else {
                        System.out.print("Position: ");
                        addPosition(id, name, quantity, price, sc.nextInt());
                    }
                    break;

                case 4:
                    System.out.print("Item ID: ");
                    removeItem(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Item ID: ");
                    int itemId = sc.nextInt();

                    System.out.print("New Quantity: ");
                    updateQuantity(itemId, sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter ID or Name: ");
                    searchItem(sc.nextLine());
                    break;

                case 7:
                    totalValue();
                    break;

                case 8:
                    display();
                    break;

                case 9:
                case 10:
                case 11:
                case 12:
                    sort(choice - 8);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
