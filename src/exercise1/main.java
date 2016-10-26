package exercise1;

public class main 
{
	public static void main(String[] args) {
		 
		String street = "경부고속도로";
		 Ford f = new Ford();
		 Benz b = new Benz();
		 ab_Ford ab_f = new ab_Ford();
		 ab_Benz ab_b = new ab_Benz();
		 
		 f.is_ride();
		 f.refueling();
		 f.whos_host();
		 
		 b.is_ride();
		 b.refueling();
		 b.whos_host();
		 
		 ab_f.run();
		 ab_f.refuel(street);
		 
		 ab_b.run();
		 ab_b.refuel(street);
	}

}
