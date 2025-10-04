package Day8.interfaces.instanceofinterface;

public class jio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Jio implements Phone {

			@Override
			public void call() {
				System.out.println("Calling using Jio");
			}

			@Override
			public void sms() {
				System.out.println("Messaging using Jio");

			}

		}
	}

}
