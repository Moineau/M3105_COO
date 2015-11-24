public abstract class Motorisation extends Voiture
{
	private float masseMoteur ;
	private float forceMoteur ;

	private Voiture v ;

	public Motorisation(Voiture uneVoiture, float uneMasseMoteur, float uneForceMoteur)
	{
		super() ;
		this.masseMoteur = uneMasseMoteur ;
		this.forceMoteur = uneForceMoteur ;
		this.v = uneVoiture ;
	}

	public abstract int prix() ;

	public float getMasseMoteur()
	{
		return this.masseMoteur ;
	}

	public float getForceMoteur()
	{
		return this.forceMoteur ;
	}

	public float getMasse()
	{
		return this.getMasseMoteur() + this.getVoiture().getMasse() ;
	}

	public Voiture getVoiture()
	{
		return v ;
	}

	public float acceleration()
	{
		return this.getForceMoteur() / (this.getVoiture().getMasse() + this.getMasseMoteur()) ;
	}

	public float distanceParcourue(float t)
	{
		return 0.5f * this.acceleration() * t * t ;
	}

	public String getModele()
	{
		return this.getVoiture().getModele() ;
	}

	public String toString()
	{
		return " moteur : poids = " + this.getMasseMoteur() + "t, force = " + this.getForceMoteur() + "N" ;
	}
}