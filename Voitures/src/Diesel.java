public class Diesel extends Motorisation
{
	private static final int prixMotorisationDiesel = 1500 ;

	public Diesel(Voiture uneVoiture, float uneMasseMoteur, float uneForceMoteur)
	{
		super(uneVoiture, uneMasseMoteur, uneForceMoteur) ;
	}

	public int prix()
	{
		return Diesel.prixMotorisationDiesel + this.getVoiture().prix();
	}

	public String toString()
	{
		return this.getVoiture() + super.toString() + " diesel (" + Diesel.prixMotorisationDiesel + "€)";
	}
}