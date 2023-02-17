
package Composite;

public abstract class Societe {
	
	protected static double coutUniteVehicule =  5.0;
	protected int nbreVehicules;
	
	// add car in society
	public void ajouteVehicule()
	{
	nbreVehicules = nbreVehicules + 1;
	}
	public abstract double calculeCoutEntretien();
	public abstract boolean ajouteFiliale(Societe filiale);
	public abstract void afficher();
	
}
