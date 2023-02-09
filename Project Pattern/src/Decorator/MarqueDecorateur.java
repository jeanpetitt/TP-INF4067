package Decorator;

public class MarqueDecorateur extends Decorateur {
	public MarqueDecorateur(ComposantVehicule composant)
	{
			super(composant);
	}
	protected void afficheLogo()
	{
		System.out.println("Logo de la marque");
	}
	public void afficher()
	{
		super.affiche();
	this.afficheLogo();
	}

}
