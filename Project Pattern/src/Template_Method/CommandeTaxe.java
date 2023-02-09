package Template_Method;

public abstract class CommandeTaxe {
	protected double montantHt;
	protected double montantTva;
	protected double montantTtc;
	
	// calcul du montant obtenu avec la tva du pays
	protected abstract void calculeTva();
	
	// calcul du montant de toute  de toutes taxes comprises
	public void calculeMontantTtc()
	{
		this.calculeTva();
		montantTtc = montantHt + montantTva;
	}
	
	//  setter sur le montant de la commande hors taxes
	public void setMontantHt(float montantHt)
	{
	this.montantHt = montantHt;
	}
	public void affiche()
	{
	System.out.println("Commande");
	System.out.println("Montant HT " + montantHt);
	System.out.println("Montant TTC " + montantTtc);
	}
}
