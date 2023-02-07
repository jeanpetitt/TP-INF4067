package Abstract_Factory;

public class ScooterEssence extends Scooter {
	
	ScooterEssence(String name){
		super(name);
	}
	ScooterEssence(){}
	
	@Override 
	public void afficher() {
		System.out.println("je suis un scooter a essence");
		System.out.println("ScooterEssence.afficher()");
	}
}
