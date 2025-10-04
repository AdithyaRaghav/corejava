package Day8.interfaces.implementinginterfaces;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public interface Bank {
			 double MIN_BALANCE = 1000;
			 double DEPOSIT_LIMIT = 25000;
			 double INTEREST_RATE = 7.8;

			 void deposit(Account account, double amount);
			 void withdraw(Account account, double amount);
			}
	}

}
