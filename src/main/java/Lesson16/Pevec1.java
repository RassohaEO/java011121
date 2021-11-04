package Lesson16;

public class Pevec1 extends Thread {
    private boolean neadStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!neadStop) {
            count++;
            if (count > 3) {
                neadStop = true;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("LA----------------");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (Monitors.MIKROFON) {
                Monitors.MIKROFON.notify();
            }
            synchronized (Monitors.MIKROFON) {
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
