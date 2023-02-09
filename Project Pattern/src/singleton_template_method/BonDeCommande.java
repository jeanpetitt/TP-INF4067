package singleton_template_method;

public class BonDeCommande extends Document {

	@Override
	public void imprimer() {
		System.out.println("Imprimer le bon de commande : " +	contenu);
	}

	@Override
	public void afficher() {
		System.out.println("Afficher le bon de commande : " +contenu);
	}

}
