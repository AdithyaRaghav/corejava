package Day6.usingfinal;

public class FinalMethodClassTest {

	public static void main(String[] args) {
		public class FinalMethodClassTest extends FinalMethodClass  {
			  // Compile time error because we cannot override the final method 
				/*
				 * @Override void show() {
				 * 
				 * System.out.println("This is the final method of FinalMethodEx class"); }
				 */
			   
		}
	}

}
