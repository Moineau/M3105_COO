public class Abs extends Freinage
{
	private static final int prixABS = 2000 ;

	public Abs(Voiture uneVoiture)
	{
		super(uneVoiture) ;
	}

	public int prix()
	{
		return Abs.prixABS + this.getVoiture().prix();
	}

	public String toString()
	{
		return this.getVoiture() + " + ABS (" + Abs.prixABS + "€)";
	}
}