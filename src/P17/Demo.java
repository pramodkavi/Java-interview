package P17;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int [] array = {3,2,2,3};
        int val =3;

        System.out.println(removeElement(array,val));
    }
    public static int removeElement(int[] nums, int val) {
        int accurences = 0, j = 0, arrLength = nums.length;
        for(int i = 0; i < arrLength-accurences; i++){
            if(nums[i] == val ){
                accurences++; j = i; nums[i]=0;
                while(j<arrLength-accurences){
                    int temp = nums[j]; nums[j] = nums[j+1]; nums[j+1] = temp;
                    j++;
                }
                i--;
                System.out.println(Arrays.toString(nums));

            }
        }
        return arrLength-accurences;

    }
}
