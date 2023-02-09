package Composite;

public class SocieteSansFiliale extends Societe {
	public boolean ajouteFiliale(Societe filiale)
	{
	return false;
	}
	public double calculeCoutEntretien()
	{
	return nbreVehicules * coutUniteVehicule;
	}
	public void afficher() {
		System.out.println("Nombre de vehicule: "+nbreVehicules+"\nCout d'entretient: "+this.calculeCoutEntretien());
	}
}
