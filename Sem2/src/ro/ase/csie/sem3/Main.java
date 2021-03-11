package ro.ase.csie.sem3;

import java.util.HashMap;
import java.util.Map;

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
			
		Map<Person, BankAccount> employees = new HashMap<>();
		
		Person p1= new Person("Chuck Norris");
		BankAccount b1= new BankAccount("RF123123123123",p1);
		System.out.println(account.getBalance());
		Person p2= new Person("Arnold");	
		BankAccount b2= new BankAccount("ING123123123123",p2);
		Person p3= new Person("Van Damme");	
		BankAccount b3= new BankAccount("BT123123123123",p3);

		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);
		
		for(BankAccount a: employees.values()) {
			a.deposit(1000);
		}
	
		for(BankAccount a: employees.values()) {
			a.withdraw(10);
		}
}
