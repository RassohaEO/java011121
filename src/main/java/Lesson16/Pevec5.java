package Lesson16;

public class Pevec5 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Monitors.MIKROFON) {
                try { Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 2; i++) {
                    System.out.println("----------------FA");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (Monitors.MIKROFON) {
                    Monitors.MIKROFON.notify();
                }
            }
        }
    }
}
