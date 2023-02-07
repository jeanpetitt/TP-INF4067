package Abstract_Factory;

public class ScooterElectric extends Scooter {
	
	ScooterElectric(String name){
		super(name);
	}
	ScooterElectric(){}
	
	@Override 
	public void afficher() {
		System.out.println("je suis un scooter Electrique");
		System.out.println("ScooterElectrique.afficher()");
	}
}
