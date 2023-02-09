package Factory_method;

public class CommandePC extends Commande {
	// constructor
	public CommandePC(float montant){
		super(montant);
	}
	
	// implement abstract method payer and valider
	public void paye()
	{
	System.out.println(
	"paiement de la commande au comptant de : " +
	this.getMontant()+"\nEtat: "+this.getEtat());
	}
	// method getter to obtain state of commande PC
	public String getEtat() {
		this.etat = "Validé";
		return this.etat;
	}
}
