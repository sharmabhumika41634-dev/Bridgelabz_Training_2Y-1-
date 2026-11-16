package Assignment;
import java.util.ArrayList;
import java.util.Scanner;
public class SocialMediaFriends {
    static class User {
        int id, age;
        String name;
        ArrayList<Integer> friends = new ArrayList<>();
        User next;

        User(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    static User head = null;

    static User findUser(int id) {
        User temp = head;

        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }

        return null;
    }

    static void addUser(int id, String name, int age) {
        if (findUser(id) != null) {
            System.out.println("User already exists");
            return;
        }

        User newUser = new User(id, name, age);

        if (head == null) {
            head = newUser;
        } else {
            User temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newUser;
        }

        System.out.println("User added");
    }

    static void addFriend(int id1, int id2) {
        User user1 = findUser(id1);
        User user2 = findUser(id2);

        if (user1 == null || user2 == null || id1 == id2) {
            System.out.println("Invalid users");
            return;
        }

        if (!user1.friends.contains(id2)) {
            user1.friends.add(id2);
            user2.friends.add(id1);
            System.out.println("Friend added");
        } else {
            System.out.println("Already friends");
        }
    }

    static void removeFriend(int id1, int id2) {
        User user1 = findUser(id1);
        User user2 = findUser(id2);

        if (user1 != null && user2 != null) {
            user1.friends.remove(Integer.valueOf(id2));
            user2.friends.remove(Integer.valueOf(id1));
            System.out.println("Friend removed");
        } else {
            System.out.println("User not found");
        }
    }

    static void displayFriends(int id) {
        User user = findUser(id);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name);

        for (int friendId : user.friends) {
            User friend = findUser(friendId);

            if (friend != null) {
                System.out.println(friend.id + " " + friend.name);
            }
        }

        System.out.println("Total Friends: " + user.friends.size());
    }

    static void mutualFriends(int id1, int id2) {
        User user1 = findUser(id1);
        User user2 = findUser(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Mutual Friends:");

        for (int friendId : user1.friends) {
            if (user2.friends.contains(friendId)) {
                User friend = findUser(friendId);

                if (friend != null) {
                    System.out.println(friend.name);
                }
            }
        }
    }

    static void searchUser(String name) {
        User temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.id + " " + temp.name
                        + " " + temp.age);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("User not found");
        }
    }

    static void displayUsers() {
        User temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.name
                    + " " + temp.age);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add User");
            System.out.println("2. Add Friend");
            System.out.println("3. Remove Friend");
            System.out.println("4. Mutual Friends");
            System.out.println("5. Display Friends");
            System.out.println("6. Search User");
            System.out.println("7. Display All Users");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    addUser(id, name, sc.nextInt());
                    break;

                case 2:
                    System.out.print("First User ID: ");
                    int id1 = sc.nextInt();

                    System.out.print("Second User ID: ");
                    addFriend(id1, sc.nextInt());
                    break;

                case 3:
                    System.out.print("First User ID: ");
                    int a = sc.nextInt();

                    System.out.print("Second User ID: ");
                    removeFriend(a, sc.nextInt());
                    break;

                case 4:
                    System.out.print("First User ID: ");
                    int x = sc.nextInt();

                    System.out.print("Second User ID: ");
                    mutualFriends(x, sc.nextInt());
                    break;

                case 5:
                    System.out.print("User ID: ");
                    displayFriends(sc.nextInt());
                    break;

                case 6:
                    System.out.print("Name: ");
                    searchUser(sc.nextLine());
                    break;

                case 7:
                    displayUsers();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
