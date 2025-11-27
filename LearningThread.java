
class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("my name is Ali");
            i++;
        }
    }
}

public class LearningThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
