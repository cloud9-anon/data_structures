import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
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

public class Doubly_linked {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Doubly Linked List Operations:");
            System.out.println("1. Show the contents of Doubly Linked List");
            System.out.println("2. Insert data into Doubly Linked List");
            System.out.println("3. Check the number of elements in the Doubly Linked List");
            System.out.println("4. Check if the Doubly Linked List is empty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Doubly Linked List: ");
                    dll.display();
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    dll.insert(data);
                    System.out.println(data + " has been inserted.");
                    break;
                case 3:
                    System.out.println("Number of elements in the Doubly Linked List: " + dll.getSize());
                    break;
                case 4:
                    if (dll.isEmpty()) {
                        System.out.println("Doubly Linked List is empty.");
                    } else {
                        System.out.println("Doubly Linked List is not empty.");
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
