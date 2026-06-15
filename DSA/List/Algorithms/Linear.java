public class Linear {

    public static int linearSearch(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50}; 
        int element=20;
        int result = linearSearch(arr, element);
System.out.println("Element found at index: " + result);
        
    }
}