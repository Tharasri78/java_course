public class Linear_matrix {

    public static int linearSearch(int arr[][], int element) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

            if (arr[i][j] == element) {
                return 1;
            }
        }}
        return -1;
    }
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; 
        int element=20;
        int result = linearSearch(arr, element);
System.out.println("Element found at index: " + result);
        
    }
}