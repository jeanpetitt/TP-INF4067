package Adapter;

public class ComposantPdf {
	protected String contenu;
	public void pdfFixeContenu(String contenu)
	{
	this.contenu = contenu;
	}
	public void pdfPrepareAffichage()
	{
	System.out.println("Affichage PDF : Début");
	}
	public void pdfRafraichir()
	{
	System.out.println("Affichage contenu PDF : " +
	contenu);
	}
	public void pdfTermineAffichage()
	{
	System.out.println("Affichage PDF : Fin");
	}
	public void pdfEnvoieImprimante()
	{
		System.out.println("Impression PDF : " + contenu);
	}
}
