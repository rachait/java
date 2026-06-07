class MyThread extends Thread {
    @Override
    public void run() {
        while(true){
        System.out.println("Thread is running");
        System.out.println("i am happy");
        }
        }
    }
class MyThread2 extends Thread {
    @Override
    public void run() {
        while(true){
        System.out.println("Thread2 is running");
        System.out.println("i am sad");
        }
        }
    }
    public class multithreading {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThread2 t2 = new MyThread2();
            t1.start();
            t
            
        }
    }