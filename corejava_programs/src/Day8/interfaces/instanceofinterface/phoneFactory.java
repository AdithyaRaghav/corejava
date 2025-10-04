package Day8.interfaces.instanceofinterface;

public class phoneFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static Phone createPhone(String company) {
			if (company.equalsIgnoreCase("Samsung"))
				return new Samsung();
			else if (company.equalsIgnoreCase("Jio"))
				return new Jio();
			return null;
		}
	}

}
