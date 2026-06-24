class Stack {
    int top = -1;
    int size = 5;
    int[] arr = new int[size];

    // Push operation
    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed");
        }
    }

    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top] + " popped");
            top--;
        }
    }

    // Peek operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Stacks {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();

        s.display();

        s.peek();
    }
}