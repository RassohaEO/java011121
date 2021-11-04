package Lesson16;

public class MyThread2 implements  Runnable{
    @Override
    public void run() {
        for (int i=10000000;i<10000300;i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
