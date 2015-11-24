public class Essence extends Motorisation
{
	private static final int prixMotorisationEssence = 1000 ;

	public Essence(Voiture uneVoiture, float uneMasseMoteur, float uneForceMoteur)
	{
		super(uneVoiture, uneMasseMoteur, uneForceMoteur) ;
	}

	public int prix()
	{
		return Essence.prixMotorisationEssence + this.getVoiture().prix();
	}

	public String toString()
	{
	return this.getVoiture() + super.toString() + " essence (" +Essence.prixMotorisationEssence + "€)";
	}
}