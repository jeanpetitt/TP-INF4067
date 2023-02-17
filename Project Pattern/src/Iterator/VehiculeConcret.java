package Iterator;

public class VehiculeConcret extends VehiculeElement {
	public VehiculeConcret(String contenu)
	{
		super(contenu);
	}
	public void affiche()
	{
		System.out.println("Description du véhicule : " +contenu);
	}
}
