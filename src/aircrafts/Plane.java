package aircrafts;

import java.util.ArrayList;

public class Plane extends FueledAircraft implements Flyable{
	
	private static final ArrayList<Plane> planeList = new ArrayList<Plane>();

	public Plane(String brandAndModel, double aircraftPrice, double fuelTankCapacity, double fuelAmount,
			double fueltoRangeRatio) {
		super(brandAndModel, aircraftPrice, fuelTankCapacity, fuelAmount, fueltoRangeRatio);
		planeList.add(this);

	}
	
	public static int getPlaneQuantity() {
		return planeList.size();
	}

	public String toString() {
		return "Aircraft Type: Plane " + "\n" + super.toString();
	}
}
