import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Steamer extends Boat implements info {

    public Steamer () {}
    public Steamer (LocalDate manufactureDate, String version, double length, double width, double time) {
        super(manufactureDate, version,length,width,time);
    }

    public void getSound() {
        System.out.println("I AM A STEAMER");
    }
    public void draw() {
        System.out.println("-------------");
    }

    public void getInfo () {
        System.out.println();
        System.out.println("A Steamer is a boat that gives out steam");
        System.out.println();
    }
}
