package bank;

public class Dem {

	public static void main(String[] args) {
		SavingAccount s= new SavingAccount(15000);
        CurrentAccount c= new CurrentAccount(12000);
        System.out.println(s.accountBalance()+c.accountBalance());
	}

}
