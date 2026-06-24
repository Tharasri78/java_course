class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class CircularSinglyLinkedList {
    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head; // points to itself
        } else {
            Node temp = head;

            // Find last node
            while (temp.next != head) {
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }
}

public class Circular_single {
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        System.out.println("Circular Singly Linked List:");
        list.display();
    }
}