
public class NoeudObservateur extends Noeud implements Observateur
{
	public NoeudObservateur(Sujet s, String unNom, int uneValeur, int unCoefficient) 
	{
		super(unNom, uneValeur, unCoefficient) ;
		s.enregistrerObservateur(this) ;
	}

	public void actualiser(int uneValeur)
	{
		this.majValeur(uneValeur);
	}
}