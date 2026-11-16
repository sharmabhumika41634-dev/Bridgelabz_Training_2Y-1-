package Assignment;

import java.util.Scanner;
public class TicketReservationSystem {
    static class Node {
        int ticketId;
        String customer, movie, seat, bookingTime;
        Node next;

        Node(int ticketId, String customer, String movie,
             String seat, String bookingTime) {
            this.ticketId = ticketId;
            this.customer = customer;
            this.movie = movie;
            this.seat = seat;
            this.bookingTime = bookingTime;
        }
    }

    static Node head = null, tail = null;

    static void addTicket(int id, String customer, String movie,
                          String seat, String time) {
        Node newNode = new Node(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Ticket booked");
    }

    static void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets");
            return;
        }

        Node temp = head;
        Node previous = tail;

        do {
            if (temp.ticketId == id) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    previous.next = temp.next;

                    if (temp == head) {
                        head = temp.next;
                    }

                    if (temp == tail) {
                        tail = previous;
                    }

                    tail.next = head;
                }

                System.out.println("Ticket cancelled");
                return;
            }

            previous = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Ticket not found");
    }

    static void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node temp = head;

        do {
            System.out.println("Ticket ID: " + temp.ticketId);
            System.out.println("Customer: " + temp.customer);
            System.out.println("Movie: " + temp.movie);
            System.out.println("Seat: " + temp.seat);
            System.out.println("Booking Time: " + temp.bookingTime);
            System.out.println("-------------------");

            temp = temp.next;

        } while (temp != head);
    }

    static void searchCustomer(String name) {
        if (head == null) return;

        Node temp = head;
        boolean found = false;

        do {
            if (temp.customer.equalsIgnoreCase(name)) {
                System.out.println("Ticket ID: " + temp.ticketId
                        + " Movie: " + temp.movie
                        + " Seat: " + temp.seat);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("Customer not found");
        }
    }

    static void searchMovie(String movie) {
        if (head == null) return;

        Node temp = head;
        boolean found = false;

        do {
            if (temp.movie.equalsIgnoreCase(movie)) {
                System.out.println("Ticket ID: " + temp.ticketId
                        + " Customer: " + temp.customer
                        + " Seat: " + temp.seat);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("Movie not found");
        }
    }

    static void countTickets() {
        int count = 0;

        if (head != null) {
            Node temp = head;

            do {
                count++;
                temp = temp.next;
            } while (temp != head);
        }

        System.out.println("Total Tickets: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Search Customer");
            System.out.println("5. Search Movie");
            System.out.println("6. Count Tickets");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Movie Name: ");
                    String movie = sc.nextLine();

                    System.out.print("Seat Number: ");
                    String seat = sc.nextLine();

                    System.out.print("Booking Time: ");
                    String time = sc.nextLine();

                    addTicket(id, customer, movie, seat, time);
                    break;

                case 2:
                    System.out.print("Ticket ID: ");
                    removeTicket(sc.nextInt());
                    break;

                case 3:
                    displayTickets();
                    break;

                case 4:
                    System.out.print("Customer Name: ");
                    searchCustomer(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Movie Name: ");
                    searchMovie(sc.nextLine());
                    break;

                case 6:
                    countTickets();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
