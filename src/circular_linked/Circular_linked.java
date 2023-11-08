package circular_linked;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;
    private int size;

    public CircularLinkedList() {
        head = null;
        size = 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class Circular_linked {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Circular Linked List Operations:");
            System.out.println("1. Show the contents of Circular Linked List");
            System.out.println("2. Insert data into Circular Linked List");
            System.out.println("3. Check the number of elements in the Circular Linked List");
            System.out.println("4. Check if the Circular Linked List is empty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Circular Linked List: ");
                    cll.display();
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    cll.insert(data);
                    System.out.println(data + " has been inserted.");
                    break;
                case 3:
                    System.out.println("Number of elements in the Circular Linked List: " + cll.getSize());
                    break;
                case 4:
                    if (cll.isEmpty()) {
                        System.out.println("Circular Linked List is empty.");
                    } else {
                        System.out.println("Circular Linked List is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
