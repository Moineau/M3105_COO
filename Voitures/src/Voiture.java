public abstract class Voiture
{
	private String modele ;
	private int numero ;
	private float masseVoiture ;

	public Voiture()
	{
	}

	public Voiture(Voiture v)
	{
		this.modele = v.getModele() ;
		this.numero = v.getNumero() ;
		this.masseVoiture = v.getMasse() ;
	}

	public Voiture(int unNumero, String unModele, float uneMasseVoiture)
	{
		this.numero = unNumero ;
		this.modele = unModele ;
		this.masseVoiture = uneMasseVoiture ;
	}

	public abstract int prix() ;

	public int getNumero()
	{
		return this.numero ;
	}

	public String getModele()
	{
		return this.modele ;
	}
	
	public float getMasse()
	{
		return this.masseVoiture ;
	}

	public String toString()
	{
		return "modele = " + this.getModele() + " n°" + this.getNumero() + " poids = " + this.getMasse() + "t (" + this.prix() + "€)" ;
	}
}