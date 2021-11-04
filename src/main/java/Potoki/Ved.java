package Potoki;

public class Ved {
    public static void main(String[] args) {
        System.out.println("Nacialo koncerta");
        Pev1 pev1 = new Pev1();
        pev1.start();
        Pev2 pev2 = new Pev2();
        pev2.setDaemon(true);
        pev2.start();

        while (pev1.isAlive()) {

        }
        System.out.println("Konec koncerta");


    }
}
