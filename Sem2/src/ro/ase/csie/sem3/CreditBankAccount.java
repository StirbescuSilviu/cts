package ro.ase.csie.sem3;

public class CreditBankAccount implements Account {
 private long balance;
 private String iban;
 private Person accounHolder;
 
public CreditBankAccount(String iban, Person accountHolder,long balance) {
	this.iban=iban;
	this.accounHolder=accountHolder;
	this.balance=balance;
}	
	public void withdraw(long amount) throws InsuficientFundsException {
		throw new UnsupportedOperationException("Cannot withdraw from this account");
		

	}

	@Override
	public void deposit(long amount) {
		// TODO Auto-generated method stub

	}

}
