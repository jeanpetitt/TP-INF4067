package Template_Method;

public class CommandeChine extends CommandeTaxe {
	protected void calculeTva()
	{
		montantTva = montantHt * 0.109;
	}
}
