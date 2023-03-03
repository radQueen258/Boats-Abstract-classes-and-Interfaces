import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Corvette extends Boat implements info  {

    public Corvette () {}

    public Corvette (LocalDate manufactureDate, String version, double length, double width, double time) {
        super(manufactureDate, version, length, width, time);

    }


    public void getSound() {
        System.out.println("I AM A CORVETTE");
    }
    public void draw() {
        System.out.println("-------------");
    }

    public void getInfo () {
        System.out.println();
        System.out.println("A Corvette is a warship, used for battles on water");
        System.out.println();
    }

}
