public class Split {

    public static void mergeSort(int[] arr) {

        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }


        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        System.out.print("Left : ");
        printArray(left);

        System.out.print("Right: ");
        printArray(right);

        mergeSort(left);
        mergeSort(right);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {8,7,6,5,4,3,2,1};

        mergeSort(arr);
    }
}