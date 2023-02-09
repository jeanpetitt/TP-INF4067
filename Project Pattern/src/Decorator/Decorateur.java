package Decorator;

public abstract class Decorateur extends ComposantVehicule{
	protected ComposantVehicule composant;
	// constructeur ayant en parametre une instance du composantVehicule
	public Decorateur(ComposantVehicule composant)
	{
	this.composant = composant;
	}
	// afficher
	public void affiche()
	{
	composant.afficher();
	}
}
