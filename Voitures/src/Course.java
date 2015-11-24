import java.util.ArrayList;

public class Course
{
	private ArrayList<Motorisation> voitures ;

	public Course()
	{
		this.voitures = new ArrayList<Motorisation>() ;
	}

	public void inscrireVoitureMotorisee(Motorisation voiture)
	{
		this.voitures.add(voiture) ;
	}

	public void simulerCourse(float d)
	{
		System.out.println("\n\nla course est lancée !") ;
			for (int t = 1 ; t <= d ; t++)
			{
				System.out.println(t + " seconde(s) :") ;

				for (int i = 0 ; i < this.voitures.size() ; i ++)
				{
					Motorisation m = this.voitures.get(i) ;
					float distance = m.distanceParcourue(t) ;

					System.out.println(m.getModele() + " a parcouru " + distance + "km") ;
				}
			}

			System.out.println("la course est terminée") ;
	}
}