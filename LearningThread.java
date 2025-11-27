import java.util.Scanner;

class MyThread extends Thread {
    @Override
    public void run() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("i=");
        sc = new Scanner("int");
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
