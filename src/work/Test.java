
// Add Pledge of Honor here.

package work;

import aircrafts.*;

public class Test {

	public static void main(String[] args) {

		System.out.println("Total number of Aircrafts before creating aircrafts: " + Aircraft.getAircraftQuantity());
		System.out.println();

        Plane brokenPlane =new Plane("",-139,1,10,-2);
		FueledAircraft boeing737 = new Plane("Boeing 737",720000,700,200,8);
		Plane cessna172 = new Plane("Cessna 172",50000,150,50,9);
		FueledAircraft da42 = new Plane("Diamond DA42",75000,600,150,5);
		Glider dg1001club = new Glider("DG Aviation DG1001Club",200000,cessna172);


        System.out.println("Total number of Aircrafts after creating aircrafts: " + Aircraft.getAircraftQuantity());
        System.out.println("Total number of Planes after creating aircrafts: " + Plane.getPlaneQuantity());
        System.out.println("Total number of Gliders after creating aircrafts: " + Glider.getGliderQuantity());

        //print all the units
        for (int i=0; i<Aircraft.getAircraftList().size(); ++i)
        	System.out.println(Aircraft.getAircraftList().get(i));


        boeing737.fly(250);
        cessna172.fly(50);
        da42.fly(240);
        dg1001club.fly(300);

        boeing737.fly(600);
        cessna172.fly(445);
        da42.fly(300);
        dg1001club.fly(150);

        cessna172.fly(100);
	}

}
