
public class App {

	public static void main(String[] args) {
		

		
		String[] texts = {"I","am","Ironman"};
		
		System.out.println(texts[0]+" "+texts[1]+" "+texts[2]);
		
		
		
		try {
			System.out.println(texts[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.toString());
		}

	}

}
