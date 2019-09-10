import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test = new Test();
		
		try {
			test.run();
		} catch (ServerException e) {
			System.out.println(e.getMessage()); //will return the message that supply the constructor
		}

	}

}
