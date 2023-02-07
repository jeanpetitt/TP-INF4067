package Abstract_Factory;

public class AutomobileElectric extends Automobile{
	AutomobileElectric(String name){
		super(name);
	}
	AutomobileElectric(){}

	@Override 
	public void afficher() {
		System.out.println("je suis un Automobile Electrique");
		System.out.println("AutomobileElectrique.afficher()");
	}
}
