import java.time.LocalDate;

public class sailBoat extends Boat {

    public sailBoat() {}
    public sailBoat (LocalDate manufactureDate, String version, double length, double width, double time) {
        super(manufactureDate, version, length, width, time);
    }

    public void getSound() {
        System.out.println("I AM A SAILBOAT");
    }
    public void draw() {
        System.out.println("-------------");
    }

}
