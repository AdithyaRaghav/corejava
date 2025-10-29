package day15.generics;

public class GenericsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class GenericMethod {
			//Generic Method
				public <E> void displayArrayElements(E[] elements) {
					for (E element : elements) {
						System.out.println("element is: " + element);
					}
				}
		}
	}

}
