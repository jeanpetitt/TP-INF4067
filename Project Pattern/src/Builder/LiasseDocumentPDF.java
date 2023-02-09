package Builder;

public class LiasseDocumentPDF extends LiasseDocument {
	LiasseDocumentPDF(String extension){
		super(extension);
	}
	
	// ajouter les documents a la liasse HTML
	public void ajouter(String document) {
		if (this.extenxion == "PDF") {
			contenu.add(document);
		}
	}
	
	// imprimer la liasse HTML
	public void afficher() {
		System.out.println("Liasse PDF");
		for(String doc: contenu) {
			System.out.println(doc);
		}
	}
}
