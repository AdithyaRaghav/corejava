package day15.generics;

public class UnBoundedWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.List;

		public class UnBoundedWildCard {
			//Parameter List(<?>) is List of unknown type
			public static void display(List<?> ll) {
				for (Object o : ll) {
					System.out.println(o);
				}
			}
		}
	}

}
