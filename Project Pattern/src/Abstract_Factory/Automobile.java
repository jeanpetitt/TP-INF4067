package Abstract_Factory;

public abstract class Automobile {
	private String modele;
	private String couleur;
	private int puissance;
	Automobile(String modele, String couleur, int puissance){
		this.modele = modele;
		this.couleur = couleur;
		this.puissance = puissance;
	}
	Automobile(){}
    //	 getter method
	public String getmodele() {
		return this.modele;
	}
	public String getCouleur() {
		return this.couleur;
	}
	
	public int getPuissance() {
		return this.puissance;
	}
	
	// setter method
	public void setModele(String modele)
	{
	this.modele = modele;
	}
	public void setCouleur(String couleur)
	{
	this.couleur= couleur;
	}
	
	public void setPuissance(int puissance)
	{
	this.puissance = puissance;
	}
	public  abstract void afficher();
}
