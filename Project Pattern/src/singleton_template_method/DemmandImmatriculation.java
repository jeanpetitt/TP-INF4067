package singleton_template_method;

public class DemmandImmatriculation extends Document {

	@Override
	public void imprimer() {
		System.out.println("imprimer la demande d'immatriculation: " +contenu);

	}

	@Override
	public void afficher() {
		System.out.println("Afficher la demande d'immatriculation : " +contenu);
	}

}
