package Composite;
import java.util.*;

public class SocieteFiliale extends Societe {
	protected List<Societe> filiales = new ArrayList<Societe>();
	
	public boolean ajouteFiliale(Societe filiale)
	{
		return filiales.add(filiale);
	}
	// calcul du cout d'ntretient pour les societes filiales
	public double calculeCoutEntretien()
	{
		double cout = 0.0;
		for (Societe filiale: filiales)
		cout = cout + filiale.calculeCoutEntretien();
		return cout;
	}
	
	public void afficher() {
		int nbreVeh = 0;
		double cout = 0.0;
		for (Societe filiale: filiales) {
			nbreVeh += filiale.nbreVehicules;
			cout = cout + filiale.calculeCoutEntretien();
		}
		
		System.out.println("Nombre de Voiture: "+nbreVeh+"\nCout d'entretiens: "+cout+"\nFiliales");
		
	}
}
