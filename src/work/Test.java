
/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Bartu Birol, 0079227>
********************************************************************************/

package work;

import aircrafts.*;

public class Test {
	
	private static void initiateFlyProcess (Aircraft a, double distance) {
		String aircraftType = a instanceof Plane ? "Plane" : a instanceof Glider ? "Glider" : "unknown type of:" + a.getClass().getSimpleName();;
	    System.out.println("Type: " + aircraftType + ", Age: " + a.getAge());

	    if (a.getAge() >= a.MAX_AGE){
	      System.out.println("The aircraft is too old to fly");
	      return;
	    }

	    a.fly(distance);

	    double ageIncrease;
	    if (a instanceof Plane) {
	      ageIncrease = 2 * distance / 100;
	    } else if (a instanceof Glider) {
	      ageIncrease = 1.5 * distance / 100;
	    } else {
	      return;
	    }
	    a.setAge(a.getAge()+ageIncrease);
	    System.out.println("Type: " + aircraftType + ", Age before flight: " + a.getAge() + ", Age after flight: " + (a.getAge() + ageIncrease));
	}

	public static void main(String[] args) {

		System.out.println("Total number of Aircrafts before creating aircrafts: " + Aircraft.getAircraftQuantity());
		System.out.println();

        Plane brokenPlane = new Plane("",-139,1,10,-2);
		FueledAircraft boeing737 = new Plane("Boeing 737",720000,700,200,8);
		Plane cessna172 = new Plane("Cessna 172",50000,150,50,9);
		FueledAircraft da42 = new Plane("Diamond DA42",75000,600,150,5);
		Glider dg1001club = new Glider("DG Aviation DG1001Club",200000,cessna172);


        System.out.println("Total number of Aircrafts after creating aircrafts: " + Aircraft.getAircraftQuantity());
        System.out.println("Total number of Planes after creating aircrafts: " + Plane.getPlaneQuantity());
        System.out.println("Total number of Gliders after creating aircrafts: " + Glider.getGliderQuantity() + "\n");

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
        
        System.out.println();
        System.out.println("\t============ INLAB TEST CODE =============");
        Plane airbus_a333 = new Plane("Airbus A333", 720_000, 700, 200, 8);
        Glider gp_15 = new Glider("gp_15", 200_000, airbus_a333);
        boeing737.refuel(80);
        cessna172.refuel(5);
        da42.refuel(50);
        airbus_a333.refuel(50);
        
        
        
        
        
        System.out.println("\n***FLY GP_15***");
        for (int i = 0; i < 8; i++) {
        initiateFlyProcess(gp_15, 100);
        }
        System.out.println("\n***FLY AIRBUS_A333***");
        for (int i = 0; i < 6; i++) {
        initiateFlyProcess(airbus_a333, 100);
        }
    
	}

}
