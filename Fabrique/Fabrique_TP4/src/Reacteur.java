public abstract class Reacteur
{
	private String marque;
	private int poids;
	private int poussee;

	public Reacteur(String uneMarque, int unPoids, int unePoussee) 
	{
		this.marque = uneMarque;
		this.poids = unPoids;
		this.poussee = unePoussee;
	}

	public Reacteur(Reacteur r)
	{
		this.marque = r.getMarque();
		this.poids = r.getPoids();
		this.poussee = r.getPoussee();
	}

	public int getPoids()
	{
		return this.poids;
	}

	public int getPoussee()
	{
		return this.poussee;
	}

	public String getMarque()
	{
		return this.marque;
	}

	public String toString()
	{
		return this.getMarque() + ", poids = " + this.getPoids() + ", pousee = " 	+ this.getPoussee() ;
	}
}