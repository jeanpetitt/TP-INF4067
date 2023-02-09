package Builder;

public class MonteurLiasseVehiculePDF extends MonteurLiasseVehicule {
	// constructeur
		public MonteurLiasseVehiculePDF(){
			liasseDoc = new LiasseDocumentPDF("PDF");
		}
		//  monteur bon de Commande
		public void monteurBonDeCommande(String nomClient){
			String doc;
			doc = "<PDF>Bon de commande Client : " +nomClient + "</PDF>";
			liasseDoc.ajouter(doc);
		}
		// monteur demande d'immatriculation
		public void monteurDemandeImmatriculation(String nomClient){
			String doc ;
			doc = "<PDF>Demande d'immatriculation  Demandeur : " +nomClient+ "</PDF>";
			liasseDoc.ajouter(doc);
		}
		// monteur certificat de session
		public void monteurCertificatSession(String nomClient) {
			String  doc;
			doc = "<PDF>Certifcat de session  Client : " +nomClient+ "</PDF>";
			liasseDoc.ajouter(doc);
		}
}
