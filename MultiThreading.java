public class MultiThreading extends Thread {
    public void run(){
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {

        MultiThreading t1 = new MultiThreading();
        t1.start();
    }

}
