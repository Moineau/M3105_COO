public class TestVoiture
{
	public static void main(String[] args)
	{
			Voiture v1 = new Ferrari(1, "Ferrari Sparrow", 1) ;

			System.out.println("modele v1 = " + v1.getModele()) ;

			Motorisation v2 = new Essence(v1, 1.5f, 2.f) ;
			System.out.print(v2) ;

			System.out.println("modele v2 = " + v2.getModele()) ;

			System.out.println(" : " + v2.prix() + " euros.") ;

			Voiture p1 = new Porsche(2, "Porsche Moineau", 1) ;
			Motorisation p2 = new Diesel(p1, 2f, 3f) ;
			System.out.print(p2) ;
			System.out.println(" : " + p2.prix() + " euros.") ;

			Course c = new Course() ;

			c.inscrireVoitureMotorisee(v2) ;
			c.inscrireVoitureMotorisee(p2) ;

			c.simulerCourse(2) ;
	}
}