package Potoki;

public class Pev1 extends Thread {

    private boolean neadstop = false;


    @Override
    public void run() {
        int count = 0;
        while (!neadstop) {
            count++;
            if (count > 3) {
                neadstop = true;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("La-----------");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Mon.MIC) {
                Mon.MIC.notify();
            }
            synchronized (Mon.MIC) {
                try {
                    Mon.MIC.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
