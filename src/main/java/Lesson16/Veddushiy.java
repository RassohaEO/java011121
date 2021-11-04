package Lesson16;

public class Veddushiy {
    public static void main(String[] args) {
        System.out.println("Nacialo Kpncerta");
        Pevec1 pevec1 = new Pevec1();
        Pevec5 pevec5 = new Pevec5();
        pevec5.setDaemon(true);
        pevec1.start();
        pevec5.start();
        while (pevec1.isAlive()){

        }
        System.out.println("konec Kpncerta");

    }
}
