
public class TestFabrique 
{
	public static void main(String[] args) 
	{
		// Airbus
		UsineJetAirbus airbus = new UsineJetAirbus("Airbus", "Toulouse");
		System.out.println(airbus);
		
		Jet jetAirbus1 = airbus.fabriquerJet("A380", "Trent");
		System.out.println(jetAirbus1);
		
		Jet jetAirbus2 = airbus.fabriquerJet("A320", "RollRoyce");
		System.out.println(jetAirbus2);
		
		// Boeing
		UsineJetBoeing boeing = new UsineJetBoeing("Boeing", "Seatle");
		System.out.println(boeing);
		
		Jet jetBoeing1 = boeing.fabriquerJet("B747", "RollRoyce");
		System.out.println(jetBoeing1);
		
		Jet jetBoeing2 = boeing.fabriquerJet("B737", "Trent");
		System.out.println(jetBoeing2);
	}
}
