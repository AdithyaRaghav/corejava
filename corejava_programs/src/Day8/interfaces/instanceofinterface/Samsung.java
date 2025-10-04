package Day8.interfaces.instanceofinterface;

public class Samsung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Samsung implements Phone {

			@Override
			public void call() {
				System.out.println("Calling using Samsung");
			}

			@Override
			public void sms() {
				System.out.println("Messaging using Samsung");

			}

		}
	}

}
