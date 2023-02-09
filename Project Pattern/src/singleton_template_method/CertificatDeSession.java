package singleton_template_method;

public class CertificatDeSession extends Document {

	@Override
	public void imprimer() {
		System.out.println("imprimer le certificat de session : " +contenu);

	}

	@Override
	public void afficher() {
		System.out.println("afficher le certificat de session : " +contenu);
	}

}
