package Day7.overloading;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static int addition(int a, int b) {
			return a + b;
		}

		public static float addition(float a, float b) {
			return a + b;
		}

		public static float addition(int a, float b) {
			return a + b;
		}

		public static float addition(float a, int b) {
			return a + b;
		}

		public static String addition(String a, String b) {
			return a + b;
	}

}
