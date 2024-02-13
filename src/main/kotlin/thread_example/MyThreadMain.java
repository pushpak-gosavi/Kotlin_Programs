package thread_example;

public class MyThreadMain extends Thread {

    @Override
    public void run() {
        // Code inside this method will be executed when the thread starts
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThreadMain myThread = new MyThreadMain();

        // Start the thread
        myThread.start();

        // Code below this line will continue to execute immediately on the main thread
        for (int i = 0; i < 3; i++) {
            System.out.println("Main thread running: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
