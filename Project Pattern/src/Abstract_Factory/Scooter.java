package Abstract_Factory;

public abstract class Scooter {
	
	private String  name;
	Scooter(String name){
		this.name =  name;
	}
	Scooter(){}
//	 get name of  electric automobile
	public String getName() {
		return this.name;
	}
	public abstract void afficher();
}
