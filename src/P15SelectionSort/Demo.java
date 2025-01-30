package P15SelectionSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int [] arr = {65,4,25,36,87,45,10,14,52,69,87,100,45,15};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minValueIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[minValueIndex]>arr[j]){
                    minValueIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minValueIndex];
            arr[minValueIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
