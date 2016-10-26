package exercise1;

public class main 
{
	public static void main(String[] args) {
		 
		String street = "경부고속도로";
		
		Car car;
		car = new Ford();
		Host host;
		host = new Ford();
		
		car.is_ride();
		car.refueling();
		host.whos_host();
		 
		Benz b = new Benz();
		
		b.is_ride();
		b.refueling();
		b.whos_host();
		 
		ab_Car c;
		c = new ab_Ford();
		
		c.run();
		c.refuel(street);
		 
		ab_Benz ab_b = new ab_Benz();
		
		ab_b.run();
		ab_b.refuel(street);
	}

}
