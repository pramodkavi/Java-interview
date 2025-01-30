package P4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        int [] arr = {1,5,6,3,2,7,8,8,8,9,6,5,4,1,2,6,4,5,5};

        Set<Integer> obj = new HashSet<>();
        for (int integer :arr) {
            obj.add(integer);
        }

        int[] uniqueArray = new int[obj.size()];
        int index = 0;
        for (int integer :
                obj) {
            uniqueArray[index++] = integer;
        }
        System.out.println(Arrays.toString(uniqueArray));
    }
}
