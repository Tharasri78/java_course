import java.util.*;

public class Mangotree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int treeNo = sc.nextInt();

    
        int row = ((treeNo - 1) % rows) + 1;
        int col = ((treeNo - 1) / rows) + 1;

        int centerRow = (rows + 1) / 2;
        int centerCol = (cols + 1) / 2;

        if (row == centerRow || col == centerCol) {
            System.out.println("It is a mango tree");
        } else {
            System.out.println("It is not a mango tree");
        }
    }
}