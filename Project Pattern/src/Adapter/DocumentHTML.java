package Adapter;

public class DocumentHTML implements DocumentType {

	protected String contenu;

	public void setContenu(String contenu) {
			this.contenu = contenu;	
	}

	@Override
	public void remplir() {
		System.out.println("Remplir document HTML : " +contenu);

	}

	@Override
	public void imprime() {
		System.out.println("Imprime document HTML : " +contenu);

	}

}
