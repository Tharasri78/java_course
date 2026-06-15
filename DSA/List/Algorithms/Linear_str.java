public class Linear_str {

    public static int linearSearch(String arr[], String element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[] = {"apple", "banana", "cherry", "date", "fig"}; 
        String element = "banana";
        int result = linearSearch(arr, element);
System.out.println("Element found at index: " + result);
        
    }
}