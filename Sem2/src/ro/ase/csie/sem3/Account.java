package ro.ase.csie.sem3;

public interface Account {

	void withdraw(long amount) throws InsuficientFundsException;

	void deposit(long amount);

}