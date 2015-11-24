public abstract class UsineJet
{	
	private String constructeur;
	private String ville;

	public UsineJet(String unConstructeur, String uneVille)
	{
		this.constructeur = unConstructeur;
		this.ville = uneVille;
	}

	public String getConstructeur()
	{
		return this.constructeur;
	}

	public String getVille()
	{
		return this.ville;
	}

	public String toString()
	{
		return "usine " + this.getConstructeur() + " de " + this.getVille();
		
	}

//
	
	public abstract Jet fabriquerJet(String modeleJet, String marqueReacteur);
}