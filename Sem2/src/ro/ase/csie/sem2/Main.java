package ro.ase.csie.sem2;

import ro.ase.csie.sem2.solid.BankAccount;
import ro.ase.csie.sem2.solid.FeeBankAccount;
import ro.ase.csie.sem2.solid.InsuficientFundsException;
import ro.ase.csie.sem2.solid.Person;
public class Main {

	public static void main(String[] args) {
//        CalendarUtil cu = new CalendarUtil();
//		
//		try {
//			System.out.println(cu.weekdDay(4));
//			System.out.println(cu.weekDay2(3));
//			System.out.println(cu.weekDay3(3));
//			System.out.println(cu.weekDay4(8));
//		} catch (IncorectDayException e) {
//			
//			e.printStackTrace();
//		}
		Person p = new Person("Silviu");
		BankAccount account = new BankAccount("INGB123123123123",p);
		account.deposit(100);
		try {
			account.withdraw(30);
			account.withdraw(40);
			account.withdraw(70);

		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
			
		System.out.println(account.getBalance());
		
		
		account = new FeeBankAccount("INGB123123234234", p);
		
		account.deposit(500);
		
		try {
			account.withdraw(100);
		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(account.getBalance());
		


	}

}
