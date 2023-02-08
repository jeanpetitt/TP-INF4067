package Abstract_Factory;

public class VehiculeElectric implements IvehiculeFactory{
	
//	 get automobileElectric
	public Automobile creerAutomobile() {
		return new AutomobileElectric("Wolwaguen", "Blanche", 500);
	}
	
//	 get scooterElectric
	public Scooter creerScooter() {
		return new ScooterElectric("Suziki", "Blanche", 100);
	}
	
}
