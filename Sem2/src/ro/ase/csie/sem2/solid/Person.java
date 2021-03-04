package ro.ase.csie.sem2.solid;

import java.util.Date;

public class Person {
	public void setName(String name) {
		this.name = name;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public long getSalary() {
		return salary;
	}
	private String name;
	private String adress;
	private Date birthDate;
	private long salary;
	public Person(String name) {
		this.name=name;
	}
	
}
