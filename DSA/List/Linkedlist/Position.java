class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at a given position (0-based index)
    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete node at a given position (0-based index)
    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class  Position {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtPosition(10, 0);
        list.insertAtPosition(20, 1);
        list.insertAtPosition(30, 2);
        list.insertAtPosition(25, 2);

        list.display(); // 10 -> 20 -> 25 -> 30 -> null

        list.deleteAtPosition(1);

        list.display(); // 10 -> 25 -> 30 -> null
    }
}
