public class Fuselage
{
	private int poids;
	private int capacite;

	public Fuselage(int unPoids, int uneCapacite) 
	{
		this.poids = unPoids;
		this.capacite = uneCapacite;
	}
	
	public int getPoids()
	{
		return this.poids;
	}
	
	public int getCapacite()
	{
		return this.capacite;
	}

	public String toString()
	{
		return "Fuselage : poids = " + this.getPoids() + " tonnes, capacite = " + this.getCapacite() + " passagers";
	}
}
