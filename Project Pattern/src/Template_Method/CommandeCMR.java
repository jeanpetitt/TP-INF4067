package Template_Method;

public class CommandeCMR extends CommandeTaxe {
	protected void calculeTva()
	{
		montantTva = montantHt * 0.1925;
	}
}
