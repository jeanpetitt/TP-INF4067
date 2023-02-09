package singleton_template_method;

public abstract class Document {
	protected String contenu;
	
	public abstract void imprimer();
	public  void setContenu(String informations) {
			contenu = informations;
	}
	public abstract void afficher();

}
