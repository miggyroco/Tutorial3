
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car is starting..");
		
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving !");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Car is shutting down");
	}

}
