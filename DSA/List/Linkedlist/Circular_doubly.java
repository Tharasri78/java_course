class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

class CircularDoublyLinkedList {
    Node head = null;

    // Insert at end
    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;

            last.next = newNode;
            newNode.prev = last;

            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Delete from beginning
    void deleteBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
        } else {
            Node last = head.prev;

            head = head.next;
            head.prev = last;
            last.next = head;
        }
    }

    // Delete from end
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
        } else {
            Node last = head.prev;
            Node secondLast = last.prev;

            secondLast.next = head;
            head.prev = secondLast;
        }
    }

    // Display
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }
}

public class Circular_doubly {
    public static void main(String[] args) {

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        System.out.println("Original List:");
        list.display();

        list.deleteBeginning();
        System.out.println("After deleting beginning:");
        list.display();

        list.deleteEnd();
        System.out.println("After deleting end:");
        list.display();
    }
}