package Abstract_Factory;

public class VehiculeElectric implements IvehiculeFactory{
	
//	 get automobileElectric
	public Automobile getAutomobile() {
		return new AutomobileElectric();
	}
	
//	 get scooterElectric
	public Scooter getScooter() {
		return new ScooterElectric();
	}

}
