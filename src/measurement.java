import java.util.Scanner;

public class measurement {
    protected double length;
    protected double width;

    protected double time;

    public double getLength () {
        return length;
    }
    public void setLength (double length) {
        this.length = length;
    }

    public double getWidth () {
        return width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getTime () {
        return time;
    }
    public void setTime (double time) {
        this.time = time;
    }

    public measurement (double length, double width, double time) {
        this.width = width;
        this.length = length;
        this.time = time;
    }
    public measurement() {}

   public void readMeasure () {
        Scanner radka = new Scanner (System.in);
        System.out.println("LENGTH: ");
        length = radka.nextDouble();
        System.out.println("WIDTH");
        width = radka.nextDouble();
        System.out.println("TIME");
        time = radka.nextDouble();
    }
}
