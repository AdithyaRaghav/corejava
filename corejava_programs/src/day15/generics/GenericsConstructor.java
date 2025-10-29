package day15.generics;

public class GenericsConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class GenericConstructors {
			private double v;

			//Generic Constructors
			public <T extends Number>GenericConstructors(T t)
			{
				v=t.doubleValue();
			}

			void show()
			{
				System.out.println("Value of v in double type is: "+v);
			}

			}
	}

}
