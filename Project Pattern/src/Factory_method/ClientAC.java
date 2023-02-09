package Factory_method;

public class ClientAC extends ClientCommande {
	
	protected Commande creerCommande(float montant)
	{
	return new CommandeAC(montant);
	}
}
