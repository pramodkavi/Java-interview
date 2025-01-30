package P8;

public class Demo {
    public static void main(String[] args) {
        int num = 10;
        boolean status = checkPrime(num);

        System.out.println("prime status is "+ status);
    }

    private static boolean checkPrime(int num) {
        if(num<2){
            return false;
        }
        for (int i = 2; i < num/2; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
