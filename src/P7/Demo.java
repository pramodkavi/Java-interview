package P7;

public class Demo {
//    public static void main(String[] args) {
////        int [] arr = {1,5,6,3,2,4,7,8,5,5,6,66,31,4,7,5,5};
////
////        findLargestNo(arr);
//        String s1 = new String("John");
//        String s2 = new String("Peter");
//        String s3 = new String("Cater");
//        for (int i = 0; i < 100000; ++i) {
//            s2 = s2 + s1;
//            s1 = s2 + s1;
//            s3 = s2 + s1;
//            System.out.println(i);
//        }
//    }
public static void main(String[] args) {
    int [] arr = {1,5,6,3,2,4,7,8,5,5,6,66,31,4,7,5,5};

    findLargestNo(arr);
}
    private static void findLargestNo(int[] arr) {
        int largeNo = 0;
        int secondLarge = 0;
        for (int num :
                arr) {
            if(largeNo<num){
                secondLarge = largeNo;
                largeNo = num;
            }else{
                if(secondLarge<num){
                    secondLarge = num;
                }
            }
        }

        System.out.println("Second large number is "+secondLarge);
    }


}
