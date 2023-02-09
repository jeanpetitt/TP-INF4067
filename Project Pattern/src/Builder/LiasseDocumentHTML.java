package Builder;

public class LiasseDocumentHTML extends LiasseDocument {
	LiasseDocumentHTML(String extension){
		super(extension);
	}
	
	// ajouter les documents a la liasse HTML
	public void ajouter(String document) {
		if (this.extenxion == "HTML") {
			contenu.add(document);
		}
	}
	
	// imprimer la liasse HTML
	public void afficher() {
		System.out.println("Liasse HTML");
		for(String doc: contenu) {
			System.out.println(doc);
		}
	}
	

}
