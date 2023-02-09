package Bridge;

import java.util.*;

public class FormulaireWidget extends Formulaire {
	Scanner reader = new Scanner(System.in);
	public void remplirTexte(String texte)
	{
	System.out.println("Formulaire  Widget\n" + texte);
	}
	public String gereZoneSaisie()
	{
	return reader.next();
	}
}
