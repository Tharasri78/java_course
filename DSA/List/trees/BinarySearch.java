class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearch {

    static boolean search(Node root, int key) {

        while (root != null) {

            if (root.data == key)
                return true;

            if (key < root.data)
                root = root.left;
            else
                root = root.right;
            
        }

        return false;    
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        int key = 40;

        if (search(root, key))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}