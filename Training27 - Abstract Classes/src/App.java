
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camera camera1 = new Camera();
		
		camera1.setId(2);
		
		Car car1 = new Car();
		
		car1.setId(7);
		
		
		car1.start();
		car1.doStuff();
		car1.shutdown();
		
		camera1.start();
		camera1.doStuff();
		camera1.shutdown();
		
		System.out.println("Test");
		
		System.out.println("Another test");
		
	}

}
