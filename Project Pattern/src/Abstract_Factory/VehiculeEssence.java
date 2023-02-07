package Abstract_Factory;

public class VehiculeEssence implements IvehiculeFactory {
	
//	 get automobileEssence
	public Automobile getAutomobile() {
		return new AutomobileEssence();
	}
	
//	 get scooterEssence
	public Scooter getScooter() {
		return new ScooterEssence();
	}

}
