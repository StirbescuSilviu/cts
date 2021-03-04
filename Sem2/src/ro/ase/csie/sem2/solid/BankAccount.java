package ro.ase.csie.sem2.solid;

public class BankAccount {
	private String iban;
	private long balance;
	private Person accountHolder;
	public BankAccount(String iban,Person person) {
		this.iban=iban;
		this.accountHolder= person;
		balance=0;
	}
	
	public void withdraw(long ammount) {
		System.out.println("withdrawing" + ammount + "from" + iban);
		balance-=ammount;
	}
	
	public void deposit(long ammount) {
		System.out.println("depositing" + ammount + "from" + iban);
		ballance+=ammount;
	}
	
	public String getIban() {
		return iban;
	}
	public long getBalance() {
		return balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountHolderAdress() {
		return accountHolderAdress;
	}
}
