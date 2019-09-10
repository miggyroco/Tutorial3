import java.io.IOException;

public class Test {
	
	public void run() throws ServerException {
		
		// Some kind of return value from some complex process!
		// 0 = success
		// anything else = error code
		
		int code = 1;
		
		if (code !=0) {
			//something's wrong
			//throw new IOException("Could not connect !");
		
			throw new ServerException("Could not connect !");
		
		}
		 
		
		System.out.println("Running successfully !");
		
	}

}
