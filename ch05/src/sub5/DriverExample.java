package sub5;

public class DriverExample {
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.driver(bus);
		
		Taxi taxi = new Taxi();
		driver.driver(taxi);
		
	}

}
