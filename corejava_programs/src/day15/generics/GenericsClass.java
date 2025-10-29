package day15.generics;

public class GenericsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class GenericClass<T>
		{
			T data;
			void set(T data)
			{
				this.data=data;
			}
			
			T get()
			{
				return data;
			}
		}
	}

}
