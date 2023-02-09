package Builder;

public class Vendeur {
	
	protected MonteurLiasseVehicule monteur;
	
	// constructor qui prend en parametre une instance du Monteur de doc
	public Vendeur(MonteurLiasseVehicule monteur) {
		this.monteur= monteur;
	}
	
	//  construire la liasse des document
	public LiasseDocument construire(String nomClient) {
		
		// construire les document
		monteur.monteurBonDeCommande(nomClient);
		monteur.monteurDemandeImmatriculation(nomClient);
		monteur.monteurCertificatSession(nomClient);
		
		// obtenir le resultat de la consruction
		LiasseDocument liasseDoc= monteur.getLiasseDocument();
		
		return liasseDoc;
	}

}
