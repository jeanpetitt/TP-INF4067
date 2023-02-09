package Builder;

public class MonteurLiasseVehiculeHTML extends MonteurLiasseVehicule {
	// constructeur
	public MonteurLiasseVehiculeHTML(){
		liasseDoc = new LiasseDocumentHTML("HTML");
	}
	//  monteur bon de Commande
	public void monteurBonDeCommande(String nomClient){
		String doc;
		doc = "<HTML>Bon de commande Client : " +nomClient + "</HTML>";
		liasseDoc.ajouter(doc);
	}
	// monteur demande d'immatriculation
	public void monteurDemandeImmatriculation(String nomClient){
		String doc ;
		doc = "<HTML>Demande d'immatriculation  Demandeur : " +nomClient+ "</HTML>";
		liasseDoc.ajouter(doc);
	}
	
	public void monteurCertificatSession(String nomClient) {
		String  doc;
		doc = "<HTML>Certifcat de session  Client : " +nomClient+ "</HTML>";
		liasseDoc.ajouter(doc);
	}
}
