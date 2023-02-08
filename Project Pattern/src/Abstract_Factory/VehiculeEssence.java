package Abstract_Factory;

public class VehiculeEssence implements IvehiculeFactory {
	
//	 get automobileEssence
	public Automobile creerAutomobile() {
		return new AutomobileEssence("Standard", "Gris", 400);
	}
	
//	 get scooterEssence
	public Scooter creerScooter() {
		return new ScooterEssence("Toyota", "Noir", 250);
	}

}
	
	