package Decorator;

public class ModeleDecorator extends Decorateur {
	// La méthode affiche du décorateur concret ModeleDecorator appelle l’affichage du composant (au travers de la
	// méthode affiche de Decorateur) puis affiche les informations techniques du modèle.
	public ModeleDecorator(ComposantVehicule composant)
			{
			super(composant);
			}
	       // afficher les infos techniques sur le modele du vehicule
			protected void afficheInfosTechniques()
			{
				System.out.println("Informations techniques du modèle");
			}
			public void afficher()
			{
			super.affiche();
			this.afficheInfosTechniques();
			}
}
