package bank;

public abstract class BankAccount {
	 private double bal;
     
	public BankAccount(double bal) {
		super();
		this.setBal(bal);
	}

	abstract double accountBalance();

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

}
