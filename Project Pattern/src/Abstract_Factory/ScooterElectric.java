package Abstract_Factory;

public class ScooterElectric extends Scooter {
	
	ScooterElectric(String modele, String couleur, int puissance){
		super(modele, couleur, puissance);
	}
	ScooterElectric(){}
	
	@Override 
	public void afficher() {
		System.out.println("Scooter Electrique");
		System.out.println(
				"    Modèle : " + this.getmodele() +
				"\n     Couleur : " + this.getCouleur() + "\n     Puissance : " +
				this.getPuissance());
	}
}
