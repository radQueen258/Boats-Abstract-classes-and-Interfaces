import java.time.LocalDate;
import java.util.Scanner;

public abstract class Boat extends measurement{
    private LocalDate manufactureDate;
    private String version;

    public void readBoat () {
        Scanner radka = new Scanner(System.in);
        super.readMeasure();
        System.out.println("Manufacture data (YYYY-MM-DD)");
        manufactureDate = LocalDate.parse(radka.nextLine());
        System.out.println("Version of the boat");
        version = radka.nextLine();
    }
    public Boat (LocalDate manufactureDate, String version, double length, double width, double time) {
        super (length, width, time);
        this.manufactureDate = manufactureDate;
        this.version = version;
    }

    public Boat() {}

    public LocalDate getManufactureDate () {
        return manufactureDate;
    }
    public void setManufactureDate (LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getVersion () {
        return version;
    }
    public void setVersion (String version) {
        this.version = version;
    }

    public double getSpeed () {
        return (length * 60) / (time * 100);
    }
    public double getCapacity() {
        return (length * width) / 15;
    }
    public void printAll() {
        draw();
        getSound();
        System.out.println("The version of the boat: " + version);
        System.out.println("The Manufacture date is: " + manufactureDate);
        System.out.println("Measurements: length (" + length + "), width(" + width + ")");
        System.out.println("The capacity: " + getCapacity());
        System.out.println("The speed: " + getSpeed());
    }

    public abstract void draw();
    public abstract void getSound();

}
