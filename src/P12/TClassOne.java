package P12;

public class TClassOne extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread One is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
