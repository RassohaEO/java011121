package Potoki;

public class Pev2 extends Thread{@Override
public void run() {
    while (true) {

        synchronized (Mon.MIC){
            try {
                Mon.MIC.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("-----------FA");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (Mon.MIC) {
            Mon.MIC.notify();
        }


    }
}


}
