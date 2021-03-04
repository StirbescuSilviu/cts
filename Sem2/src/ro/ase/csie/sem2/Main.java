package ro.ase.csie.sem2;

import ro.ase.csie.sem2.solid.BankAccount;

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
			account.withdraw(50);
			account.withdraw(70);	
	}

}