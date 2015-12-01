import java.util.ArrayList ;

public class NoeudSujet extends Noeud implements Sujet 
{
	private ArrayList<Observateur> observateurs; 
	
	public NoeudSujet(String unNom, int uneValeur, int unCoefficient) 
	{
		super(unNom, uneValeur, unCoefficient);
		this.observateurs = new ArrayList<Observateur>();
	}
	
	public void enregistrerObservateur(Observateur o) 
	{
		this.observateurs.add(o);
	}
	
	public void supprimerObservateur(Observateur o)
	{
		this.observateurs.remove(o);
	}
	
	public void notifierObservateurs()
	{
		for(int i = 0 ; i < this.observateurs.size(); i++)
		{
			this.observateurs.get(i).actualiser(this.getValeur());
		}
	}

	public void changementValeur(int uneValeur)
	{
		this.majValeur(uneValeur);
		this.notifierObservateurs();
	}
}