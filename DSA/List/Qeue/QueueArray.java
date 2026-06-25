class Queue {
    int front = -1;
    int rear = -1;
    int size = 5;
    int[] arr = new int[size];

    // Enqueue
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = data;
        }
    }

    // Dequeue
    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];
        front++;
        return value;
    }
}

public class QueueArray {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());
    }
}
