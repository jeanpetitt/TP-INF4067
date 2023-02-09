package singleton_template_method;

import java.util.ArrayList;

public final class LiasseViergeDocument {
	public ArrayList<Document> documents ;
	private static LiasseViergeDocument instance;
	
	// constructor sans parametre
	private LiasseViergeDocument() {}
	// construcor avec parametre
	private LiasseViergeDocument(ArrayList<Document> documents ) {
		this.documents = documents;
	}
	
	// obtenir une seule instance de la liasseVierge 
	public static LiasseViergeDocument getLiasseVierge() {
		if (instance == null) {
			instance = new LiasseViergeDocument();
		}
		return instance;
	}
	
	// obtenir une seule instance de la liasseVierge 
		public static LiasseViergeDocument getLiasseVierge(ArrayList<Document> documents ) {
			
			if (instance == null) {
				instance = new LiasseViergeDocument(documents);
			}
			return instance;
		}
	
	// add document in liasseVierge
	public void ajouter(Document doc) {
		documents.add(doc);
		doc.afficher();
		System.out.println("add done");
	}
	// retirer un document dans la liasse
	public void retirer(Document doc) {
		documents.remove(doc);
		System.out.println("delete done");
	}
	// afficher les document qui sont dans la liasse vierge
	public void getDocument() {
		for(Document doc: documents) {
			doc.afficher();
		}
	}
	
	
}
