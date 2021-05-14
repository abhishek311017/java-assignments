package bank;

public class SavingAccount extends BankAccount {
 

	public SavingAccount(double bal) {
		super(bal);
		
	}

	@Override
	double accountBalance() {
		return getBal();
	}


	

}
