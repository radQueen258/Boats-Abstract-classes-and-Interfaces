import java.time.LocalDate;

public class Main_HW01 {

    public static void main(String[] args) {

       Ship ship = new Ship (LocalDate.of(2003,03,22),
                    "STREAM-3900", 4.0,5.0, 12.0);
        ship.printAll();
        System.out.println();

        Ship ship1 = new Ship();
        ship1.readShip();
        System.out.println();

       //Comparison between ships
       System.out.println("CThe comparison returns: " + ship.compareTo(ship1));
       int result = ship.compareTo(ship1);

       if (result < 0)
        System.out.println(ship.getVersion() + " has more capacity than " + ship1.getVersion());
       else if ( result > 0)
        System.out.println(ship1.getVersion() + " has more capacity than " + ship.getVersion());
       else
        System.out.println(ship.getVersion() + " has the same capacity as " + ship1.getVersion());

       //                           -------STEAMER BOAT---------

     Steamer steamer = new Steamer(LocalDate.of(2002,9,23),
                        "CAST-2000", 23.7,12.0,43.8);
        steamer.printAll();
        steamer.getInfo();
        System.out.println();

        //                     -----------SAIL BOAT------------

        sailBoat SailBoat = new sailBoat(LocalDate.of(2005,4,26),
                            "TAVAR-1500", 23.0, 25.0,12.0);
        SailBoat.printAll();
        System.out.println();

        //                        ---------CORVETTE BOAT------------
        Corvette corvette = new Corvette(LocalDate.of(1998,8,12),
                            "WAR-7688", 12.9,24.0,12);
        corvette.printAll();
        corvette.getInfo();
        System.out.println();

        //                 -----------BOAT ARRAY---------------

        Boat[] boats = new Boat[6];
        boats [0] = steamer;
        boats [1] = ship;
        boats [2] = new Corvette(LocalDate.of(1995,5,21),
                    "RFN-4532", 12.8, 34.0,16.0);
        boats [3] = corvette;
        boats [4] = SailBoat;
        boats [5] = new Steamer(LocalDate.of(1999,4,30),
                  "DENIS-2300",43.07,23.0,43.09);

        // Printing the boat array
        for (var b : boats) {
            b.printAll();
            System.out.println();
        }



    }
}
