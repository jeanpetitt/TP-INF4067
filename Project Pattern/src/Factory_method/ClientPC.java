package Factory_method;

public class ClientPC extends ClientCommande {
	
	protected Commande creerCommande(float montant)
	{
	return new CommandePC(montant);
	}
}
