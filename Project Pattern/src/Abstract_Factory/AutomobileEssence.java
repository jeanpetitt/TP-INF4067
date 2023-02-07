package Abstract_Factory;

public class AutomobileEssence extends Automobile {
	AutomobileEssence(String name){
		super(name);
	}
	AutomobileEssence(){}
	
	@Override 
	public void afficher() {
		System.out.println("je suis un automobile a essence");
		System.out.println("AutomobileEssence.afficher()");
	}
}
