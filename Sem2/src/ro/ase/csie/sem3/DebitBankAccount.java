package ro.ase.csie.sem3;

public class DebitBankAccount extends BankAccount implements Payable, Receivable {


	public DebitBankAccount(String iban, Person person) {
		this.iban = iban;
		this.accountHolder = person;
		balance = 0;
	}

	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		{if (amount > balance)
			throw new InsuficientFundsException("Insuficient funds " + balance);
		System.out.println("withdrawing " + amount + " from " + iban);
		balance -= amount;
	}

	@Override
	public void deposit(long amount) {
		System.out.println("Adding " + amount + " to " + iban);
		balance += amount;
	}

	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}
	public void transfer(Receivable destionation, long amount) throws {
		this.withdraw(amount);
		destination.deposit(amount);
	}

}