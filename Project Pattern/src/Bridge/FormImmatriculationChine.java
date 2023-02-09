package Bridge;

public class FormImmatriculationChine extends ForImmatriculation {
	public FormImmatriculationChine(Formulaire form){
		super(form);
	}
	
	protected boolean controleSaisie(String plaque)
	{
	return plaque.length() == 5;
	}
	
}
