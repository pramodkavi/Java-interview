package P12;

public class Demo {
    public static void main(String[] args) {
        TClassOne t1 = new TClassOne();
        Thread t2 = new Thread(new TClassTwo());

        t1.start();
        t2.start();
    }
}
