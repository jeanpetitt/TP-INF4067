package Builder;

import java.util.ArrayList;
import java.util.List;

public abstract class LiasseDocument {
	
	protected String extenxion;
	// constructor
	// contenu de la liasse
	protected List<String> contenu = new ArrayList<String>();
	LiasseDocument(String extension){
		this.extenxion = extension;
	}
	
	// ajouter un document a la liasse des document
	public abstract void ajouter(String document);
	public abstract void afficher();

}
