package P9;

public class Demo {
    public static void main(String[] args) {
        int factNo = 5;

        int num = findFactorial(factNo);
        System.out.println(num);
    }

    private static int findFactorial(int factNo) {
        if(factNo == 0){
            return 1;
        }
        return factNo*findFactorial(factNo-1);
    }

}
