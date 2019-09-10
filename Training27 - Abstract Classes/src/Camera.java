
public class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Camera is starting ...");
		
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Snap !!");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Camera is shutting down");
	}

}
