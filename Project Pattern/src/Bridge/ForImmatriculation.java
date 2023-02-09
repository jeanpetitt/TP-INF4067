package Bridge;

public abstract class ForImmatriculation {
	protected String contenu;
	protected Formulaire form;
	public ForImmatriculation(Formulaire form)
	{
	this.form = form;
	}
	
	public void affiche()
	{
	form.remplirTexte(
	"numéro de la plaque existante : ");
	}
	// generer un doc
	public void genereDocument()
	{
	form.remplirTexte("Demande d’immatriculation");
	form.remplirTexte("numéro de plaque : " +
	contenu);
	}
	// gerer le contrôle de saisie
	public boolean gereSaisie()
	{
	contenu = this.form.gereZoneSaisie();
	return this.controleSaisie(contenu);
	}
	protected abstract boolean controleSaisie(String plaque);
	

}
