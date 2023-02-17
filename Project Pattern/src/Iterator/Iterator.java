package Iterator;

import java.util.List;

public abstract class Iterator {
	protected String motCleRecherche;
	protected int index;
	// list des vehicules dans le catalogue
	protected List<VehiculeElement> contenu ;
	
	
	public void debut()
	{
		index= 0;
		int taille = contenu.size();
		while ((index < taille) && (!contenu.get(index).motCleValide(motCleRecherche))) 
		{
			index++;
		}
	}
	// obtenir l
	public void suivant() {
		
	}
}