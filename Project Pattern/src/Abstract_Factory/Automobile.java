package Abstract_Factory;

public abstract class Automobile {
	private String  name;
	Automobile(String name){
		this.name =  name;
	}
	Automobile(){}
//	 get name of  electric automobile
	public String getName() {
		return this.name;
	}
	public  abstract void afficher();
}
