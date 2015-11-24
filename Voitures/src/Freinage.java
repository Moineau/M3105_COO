public abstract class Freinage extends Voiture
{
	private Voiture v ;

	public Freinage(Voiture uneVoiture)
	{
		super() ;
		this.v = uneVoiture ;
	}

	public abstract int prix() ;

	public Voiture getVoiture()
	{
		return v ;
	}

	public String getModele()
	{
		return this.getVoiture().getModele() ;
	}
}