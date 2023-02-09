package Adapter;

public class DocumentPDF implements DocumentType {
	// get instance to adapte component Composantpdf to adapteur pdf
	protected ComposantPdf outilPdf = new ComposantPdf();
	

	public void setContenu(String contenu) {
		outilPdf.pdfFixeContenu(contenu);	
	}

	@Override
	public void remplir() {
		outilPdf.pdfPrepareAffichage();
		outilPdf.pdfRafraichir();
		outilPdf.pdfTermineAffichage();

	}
	@Override
	public void imprime() {
		outilPdf.pdfEnvoieImprimante();
	}

}
