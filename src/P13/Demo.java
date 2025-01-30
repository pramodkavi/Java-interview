package P13;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int [] arr={2,6,8,9,4,88,55,22,34,79,54,12};

        sortArray(arr);
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                int temp;
                if(arr[i]>arr[i+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for each pass
            for (int j = 0; j < arr.length - i - 1; j++) { // Inner loop for comparison
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
