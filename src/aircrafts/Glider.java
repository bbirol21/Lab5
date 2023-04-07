package aircrafts;

import java.util.ArrayList;

public class Glider extends Aircraft implements Flyable{

	private static final ArrayList<Glider> gliderList = new ArrayList<Glider>();
	private Plane helperPlane;
	private static final double MAX_AGE = 20;
	
	public double getMAX_AGE() {
		return MAX_AGE;
	}

	public Glider(String brandAndModel, double aircraftPrice, Plane helperPlane) {
		super(brandAndModel, aircraftPrice);
		this.helperPlane = helperPlane;
		gliderList.add(this);
	}
	
	public static int getGliderQuantity() {
		return gliderList.size();
	}

	public String toString() {
		return "Aircraft Type: Glider " + "\n" + super.toString() + "Helper Plane: " + helperPlane.getBrandAndModel() + "\n";
	}
	
	public void fly(double km) {
		
		if (km <= 0) {
            System.out.println("Fly Glider input is invalid !!");
            return;
        }
		
		if (helperPlane.getFuelAmount() <= 0) {
			System.out.println("Glider " + this.getBrandAndModel() + " could not fly..." + "\n");
			return;
		}
		
		if (km/4 <= (helperPlane.getFueltoRangeRatio()* helperPlane.getFuelAmount())) {
            helperPlane.fly(km/4);
            totalFlightDistance += km;
            System.out.println("The glider " + this.getBrandAndModel() + "has flown " + this.getTotalFlightDistance() + " km" + "\n");
        } 
		
		else {
            System.out.println("The helper plane does not have enough range to fly the glider that far.");
        }
	}
	
}
