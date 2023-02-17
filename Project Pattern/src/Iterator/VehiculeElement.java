package Iterator;

public abstract class VehiculeElement {
	// description of object vehicule
	protected String contenu;
	public VehiculeElement(String contenul)
	{
	this.contenu = contenul;
	}
	public boolean motCleValide(String motCle)
	{
	return contenu.indexOf(motCle) != - 1;
	}
}
