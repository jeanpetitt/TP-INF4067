package Factory_method;
import java.util.*;


public abstract class ClientCommande {
	protected List<Commande> commandes = new ArrayList<Commande>();
	
	protected abstract Commande creerCommande(float montant);
	
	// obtenir une nouvelle commande
	public Commande getNewCommande(float montant)
	{
	return creerCommande(montant);
	}

}
