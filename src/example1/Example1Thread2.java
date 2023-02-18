package example1;

public class Example1Thread2 extends Thread{
    Thread thread;
    public Example1Thread2(Thread thread) {
        this.thread = thread;
    }
    @Override
    public void run() {
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw
        }
        System.out.println("Thread 2");
    }
    static public String threadRunner(Thread thread) throws InterruptedException {
        thread.join();
        return "OK";
    }
}
