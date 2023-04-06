package aircrafts;

public abstract class FueledAircraft extends Aircraft implements Flyable{
	
	protected double fuelTankCapacity;
	protected double fuelAmount;
	protected double fueltoRangeRatio;
	

	public FueledAircraft(String brandAndModel, double aircraftPrice, double fuelTankCapacity, double fuelAmount, double fueltoRangeRatio) {
		super(brandAndModel, aircraftPrice);
		
		if (fuelTankCapacity < 10) {
			this.fuelTankCapacity = 10;
		}
		else {
			this.fuelTankCapacity = fuelTankCapacity;
		}
		
		if (fuelAmount < 0) {
			this.fuelAmount = 0;
		}
		else if (fuelAmount > fuelTankCapacity) {
			this.fuelAmount = fuelTankCapacity;
		}
		else {
			this.fuelAmount = fuelAmount;
		}
		
		if (fueltoRangeRatio < 1) {
			this.fueltoRangeRatio = 1;
		}
		else {
			this.fueltoRangeRatio = fueltoRangeRatio;
		}
		
	}

	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}


	public double getFuelAmount() {
		return fuelAmount;
	}


	public double getFueltoRangeRatio() {
		return fueltoRangeRatio;
	}
	
	public void fly (double km) {
		
		if (km <= 0) {
			System.out.println("Fly Fueled Aircraft input is invalid !!");
			return;
		}
		double currentRange = fuelAmount * fueltoRangeRatio;
		if (km < currentRange) {
			fuelAmount = fuelAmount - (km/fueltoRangeRatio);
			currentRange = fuelAmount * fueltoRangeRatio;
			System.out.println("Fueled Aircraft " + this.getBrandAndModel() + " flew " + km + " km, " + fuelAmount + " L of fuel left."
					+ "\n" + "Fueled Aircraft Current Range: " + currentRange + " km" + "\n");
		}
		else if (currentRange == 0) {
			System.out.println("Fueled Aircraft " + this.getBrandAndModel() + " could not fly... " + fuelAmount + " L of fuel left."
					+ "\n" + "Fueled Aircraft Current Range: " + currentRange + " km" + "\n");
		}
		else {
			System.out.print("Fueled Aircraft " + this.getBrandAndModel() + " could only fly " + currentRange + " km , ");
			fuelAmount = fuelAmount - (currentRange/fueltoRangeRatio);
			currentRange = fuelAmount * fueltoRangeRatio;
			System.out.print(fuelAmount + " L of fuel left. " + "\n" + "Current Range: " + currentRange + " km" + "\n");
		}
	}

	@Override
	public String toString() {
		double maxRange = fueltoRangeRatio * fuelTankCapacity;
		double currentRange = fueltoRangeRatio * fuelAmount;
		return super.toString() + "Max Range: " + maxRange + "\n" + "Current Fuel Level: " + fuelAmount + " L" + "\n" 
				+ "Current Range: " + currentRange + "\n";
	}
	
	

	
}
