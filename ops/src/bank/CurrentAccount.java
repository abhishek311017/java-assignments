package bank;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(double bal) {
		super(bal);
	}

	@Override
	double accountBalance() {
		
		return getBal();
	}

}
