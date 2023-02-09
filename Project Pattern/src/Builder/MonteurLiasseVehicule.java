package Builder;

public abstract class MonteurLiasseVehicule {
	protected LiasseDocument liasseDoc;
	
    // monter les différents type de documents
	public abstract void monteurBonDeCommande(String nomClient);
	public abstract void monteurDemandeImmatriculation(String nomClient);
	public abstract void monteurCertificatSession(String nomClient);
	public LiasseDocument getLiasseDocument()
	{
	return liasseDoc;
	}

}
