class Node{
    int data;
    Node next;

}

class Stack{
    Node top=null;

    void push(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=top;
        top=newNode;
        System.out.println(data + "pushed"); 
    }
    void pop (){
        if (top==null){
            System.out.println("Stack Underflow");

         
        }else{
            System.out.println(top.data + " popped");

        }
    }
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");

        }
        else{
            System.out.println("Top element: " + top.data);

        }
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    }
    public class Stack_linlit {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();

        s.display();
    }
    
}