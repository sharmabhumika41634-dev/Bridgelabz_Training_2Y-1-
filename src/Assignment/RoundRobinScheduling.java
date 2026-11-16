package Assignment;
import java.util.Scanner;
public class RoundRobinScheduling {
    static class Node {
        int id, burst, priority;
        Node next;

        Node(int id, int burst, int priority) {
            this.id = id;
            this.burst = burst;
            this.priority = priority;
        }
    }

    static Node head = null, tail = null;

    static void addProcess(int id, int burst, int priority) {
        Node newNode = new Node(id, burst, priority);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    static void display() {
        if (head == null) {
            System.out.println("No processes");
            return;
        }

        Node temp = head;

        do {
            System.out.println("Process ID: " + temp.id
                    + " Burst: " + temp.burst
                    + " Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    static void removeProcess(int id) {
        if (head == null) return;

        Node temp = head;
        Node previous = tail;

        do {
            if (temp.id == id) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    previous.next = temp.next;

                    if (temp == head) head = temp.next;
                    if (temp == tail) tail = previous;

                    tail.next = head;
                }

                System.out.println("Process removed");
                return;
            }

            previous = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Process not found");
    }

    static void simulate(int quantum) {
        if (head == null || quantum <= 0) {
            System.out.println("No processes or invalid quantum");
            return;
        }

        int count = 0;
        Node temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        int[] id = new int[count];
        int[] burst = new int[count];
        int[] remaining = new int[count];
        int[] completion = new int[count];

        temp = head;

        for (int i = 0; i < count; i++) {
            id[i] = temp.id;
            burst[i] = temp.burst;
            remaining[i] = temp.burst;
            temp = temp.next;
        }

        int time = 0;
        boolean active = true;

        while (active) {
            active = false;

            for (int i = 0; i < count; i++) {
                if (remaining[i] > 0) {
                    active = true;

                    if (remaining[i] > quantum) {
                        time += quantum;
                        remaining[i] -= quantum;
                    } else {
                        time += remaining[i];
                        remaining[i] = 0;
                        completion[i] = time;

                        System.out.println("Process " + id[i] + " completed");
                    }
                }
            }

            System.out.println("Time: " + time);
        }

        double totalWaiting = 0;
        double totalTurnaround = 0;

        System.out.println("\nID\tBurst\tWaiting\tTurnaround");

        for (int i = 0; i < count; i++) {
            int turnaround = completion[i];
            int waiting = turnaround - burst[i];

            totalWaiting += waiting;
            totalTurnaround += turnaround;

            System.out.println(id[i] + "\t" + burst[i]
                    + "\t" + waiting + "\t" + turnaround);
        }

        System.out.println("Average Waiting Time: " + totalWaiting / count);
        System.out.println("Average Turnaround Time: " + totalTurnaround / count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Process");
            System.out.println("2. Remove Process");
            System.out.println("3. Display Processes");
            System.out.println("4. Run Round Robin");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("Process ID: ");
                    int id = sc.nextInt();

                    System.out.print("Burst Time: ");
                    int burst = sc.nextInt();

                    System.out.print("Priority: ");
                    int priority = sc.nextInt();

                    addProcess(id, burst, priority);
                    break;

                case 2:
                    System.out.print("Process ID: ");
                    removeProcess(sc.nextInt());
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.print("Time Quantum: ");
                    simulate(sc.nextInt());
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
