package P16InsertionSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int [] arr = {65,4,25,36,87,45,10,14,52,69,87,100,45,15};

        insertionSort(arr);
        Integer t = Integer.valueOf("1");
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            while(index>=1){
                if(arr[index-1]>arr[index]){
                    int temp = arr[index];
                    arr[index] = arr[index-1];
                    arr[index-1] = temp;
                }
                index--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
