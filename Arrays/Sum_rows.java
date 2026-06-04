import java.util.Scanner;

public class Sum_rows {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        int maxRow = 0;

        for(int i = 0; i < rows; i++) {
            int sum = 0;

            for(int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }

            if(sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Maximum Sum Row:");

        for(int j = 0; j < cols; j++) {
            System.out.print(arr[maxRow][j] + " ");
        }
    }
}