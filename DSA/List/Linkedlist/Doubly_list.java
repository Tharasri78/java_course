class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Doubly_list{
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        System.out.println("Doubly Linked List:");
        list.display();
    }
}