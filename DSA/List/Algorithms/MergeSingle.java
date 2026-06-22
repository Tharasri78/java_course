public class MergeSingle {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};

        int mid = arr.length / 2;

        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - mid];

    
        for (int i = 0; i < mid; i++) {
            arr1[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            arr2[i - mid] = arr[i];
        }

        
        int[] result = new int[arr.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged Array:");
        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }
    }
}



