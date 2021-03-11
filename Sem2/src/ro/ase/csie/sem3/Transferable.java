package ro.ase.csie.sem3;

public interface Transferable {
public void transfer(Receivable destination, long amount) throws InsuficientFundsException;
}
