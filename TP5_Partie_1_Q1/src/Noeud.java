
public class Noeud 
{
	private String 	nom; 		
	private int valeur;
	private int capacite;

	public Noeud(String unNom, int uneValeur, int uneCapacite) 
	{
		this.setNom(unNom);
		this.setValeur(uneValeur);
		this.setCapacite(uneCapacite);
	}

	public String getNom() 
	{
		return this.nom;
	}

	public void setNom(String unNom)
	{
		this.nom = unNom;
	}

	public int getValeur() 
	{
		return this.valeur;
	}

	public void setValeur(int uneValeur)
	{
		this.valeur = uneValeur;
	}

	public int getCapacite()
	{
		return this.capacite;
	}
	
	public void setCapacite(int unCoefficient)
	{
		this.capacite = unCoefficient;
	}

	public String toString()
	{
		return "(" + this.getNom() + ", "  + this.getValeur() + ", " + this.getCapacite() + ")";
	}

	public void majValeur(int v)
	{
		this.setValeur(this.getValeur() + v * this.getCapacite());
	}	
}