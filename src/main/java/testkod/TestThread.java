package testkod;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Mytr t1 = new Mytr();
        Mytr t2 = new Mytr();
        Mytr t3 = new Mytr();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
class Mytr extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}