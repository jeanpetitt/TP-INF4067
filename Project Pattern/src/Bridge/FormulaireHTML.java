package Bridge;

import java.util.Scanner;

public class FormulaireHTML extends Formulaire {
	Scanner reader = new Scanner(System.in);
	public void remplirTexte(String texte)
	{
	System.out.println("Formulaire HTML \n" + texte);
	}
	public String gereZoneSaisie()
	{
	return reader.next();
	}
}
