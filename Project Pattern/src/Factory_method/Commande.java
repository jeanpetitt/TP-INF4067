package Factory_method;

public abstract class Commande {
	private  float montant;
	protected String etat;
	// constructor
	Commande(float montant){
		this.montant = montant;
	}
	
   // getter method
	public float getMontant() {
		return this.montant;
	}
	public abstract String getEtat();
	// setter
	public void setMontant(float montant) {
		this.montant = montant;

	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public abstract void paye();
}
