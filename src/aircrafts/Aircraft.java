package aircrafts;

import java.util.*;

public abstract class Aircraft  implements Flyable{

	//Refers to the general type entity that can be flown.
	
	//ArrayList<String> cars = new ArrayList<String>(); 
	
	protected static ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();
	protected String brandAndModel;
	protected double aircraftPrice;
	protected double totalFlightDistance;
	
	public static ArrayList<Aircraft> getAircraftList() {
		return aircraftList;
	}

	public String getBrandAndModel() {
		return brandAndModel;
	}

	public double getAircraftPrice() {
		return aircraftPrice;
	}

	public double getTotalFlightDistance() {
		return totalFlightDistance;
	}

	public static int getAircraftQuantity() {
		return aircraftList.size();
	}
	
	public void fly (double km) {
		
	}
	
	public Aircraft(String brandAndModel, double aircraftPrice) {
		
		if (aircraftPrice < 0) {
			this.aircraftPrice = 0;
		}
		else {
			this.aircraftPrice = aircraftPrice;
		}
		if (brandAndModel == null || brandAndModel.length() == 0) {
			this.brandAndModel = "Anonymus";
		}
		else {
			this.brandAndModel = brandAndModel;
		}
		aircraftList.add(this);
	}

	@Override
	public String toString() {
		return "Name: " + brandAndModel + "\n" + "Price: " + aircraftPrice
				+ "$" + "\n" + "Total Flight Distance: " + totalFlightDistance + "\n";
	}
	
	
	
}
