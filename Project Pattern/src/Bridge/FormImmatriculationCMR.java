package Bridge;


public class FormImmatriculationCMR extends ForImmatriculation {
	public FormImmatriculationCMR(Formulaire form){
		super(form);
	}
	protected boolean controleSaisie(String plaque)
	{
	return (plaque.length() >= 7 && plaque.length() <= 8);
	}
}
