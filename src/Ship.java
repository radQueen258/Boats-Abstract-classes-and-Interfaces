import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Ship extends Boat implements Comparable {
    Scanner radka = new Scanner(System.in);

    public Ship () {}
    public Ship (LocalDate manufactureDate, String version, double length, double width, double time) {
        super(manufactureDate, version, length, width, time);
    }

    public void readShip () {
        Scanner radka = new Scanner (System.in);
        super.readBoat();
    }
    public void getSound() {
        System.out.println("I AM A SHIP");
    }
    public void draw() {
        System.out.println("-------------");
        System.out.println();
    }

    public int compareTo (Object temp) {
        Ship other = (Ship) temp;
        if (getCapacity() > other.getCapacity()) {
            return 1;
        } else if (getCapacity() < other.getCapacity()){
            return -1;
        } else {
            return 0;
        }
    }

}
