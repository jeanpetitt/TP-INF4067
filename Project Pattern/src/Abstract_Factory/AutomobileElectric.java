package Abstract_Factory;

public class AutomobileElectric extends Automobile{
	AutomobileElectric(String modele, String couleur, int puissance){
		super(modele,  couleur, puissance);
	}
	AutomobileElectric(){}

	@Override 
	public void afficher() {
		System.out.println("Automobile Electrique");
		System.out.println(
				"     Modèle : " + this.getmodele() +
				"\n     Couleur : " + this.getCouleur() + "\n     Puissance : " +
				this.getPuissance());
	}
}
