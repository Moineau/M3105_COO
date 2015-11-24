public class FreinageMagnetique extends Freinage
{
	private static final int prixFreinageMagnetique = 2000 ;

	public FreinageMagnetique(Voiture uneVoiture)
	{
		super(uneVoiture) ;
	}

	public int prix()
	{
		return FreinageMagnetique.prixFreinageMagnetique + this.getVoiture().prix();
	}

	public String toString()
	{
		return this.getVoiture() + " + freinage magnetique (" + FreinageMagnetique.prixFreinageMagnetique + "€)";
	}

	public String getModele()
	{
		return this.getVoiture().getModele() ;
	}
}