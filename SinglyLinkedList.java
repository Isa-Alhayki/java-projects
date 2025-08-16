// SinglyLinkedList.java
// Example implementation of a singly linked list in Java

public class SinglyLinkedList {
    
    // Node class to represent each element in the list
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    // Add new node at the end
    public void add(String data) {
        Node newNode = new Node(data);
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

    // Display all nodes
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        system.out.println();
    }

    // Insert at the beginning
    public void insertFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete first node
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Main method to test the list
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add nodes
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        
        // Display list
        system.out.println("Initial list:");
        list.display();

        // Insert at beginning
        list.insertFirst("Zara");
        system.out.println("After inserting at beginning:");
        list.display();

        // Delete first node
        list.deleteFirst();
        system.out.println("After deleting first node:");
        list.display();
    }
}
