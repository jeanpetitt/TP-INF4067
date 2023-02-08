package Abstract_Factory;

public class AutomobileEssence extends Automobile {
	AutomobileEssence(String modele, String couleur, int puissance){
		super(modele,  couleur, puissance);
	}
	AutomobileEssence(){}

	@Override 
	public void afficher() {
		System.out.println("Automobile à Essence");
		System.out.println(
				"     Modèle : " + this.getmodele() +
				"\n     Couleur : " + this.getCouleur() + "\n    Puissance : " +
				this.getPuissance());
	}
}
