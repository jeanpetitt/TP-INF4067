package Factory_method;

public class CommandeAC extends Commande {
	//constructor
	public CommandeAC(float montant) {
		super(montant);
	}
	
	// implement abstract method payer and valider
	public void paye()
	{
	System.out.println(
	"paiement de la commande assortit du credit de : " +
	this.getMontant() +"\nEtat: "+this.getEtat());
	}
	// get state of commande ac
	public String getEtat() {
		if (this.getMontant() >= 5000 &&  this.getMontant() <= 30000) {
			this.etat = "Validé";
		}else{
			this.etat = "Echec";
		}
		return this.etat;
	}
}
