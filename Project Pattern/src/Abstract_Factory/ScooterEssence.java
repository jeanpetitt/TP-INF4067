package Abstract_Factory;

public class ScooterEssence extends Scooter {
	
	ScooterEssence(String modele, String couleur, int puissance){
		super(modele, couleur, puissance);
	}
	ScooterEssence(){}
	
	@Override 
	public void afficher() {
		System.out.println("Scooter à Essence");
		System.out.println(
				"     Modèle : " + this.getmodele() +
				"\n     Couleur : " + this.getCouleur() + "\n     Puissance : " +
				this.getPuissance());
	}
}
