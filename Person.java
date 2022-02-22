package campionato;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String name, lastName, task;
	private int dob;
	
	// getter - setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}

	// constructor
	public Person(String name, String lastName, int dob, String task) {
		this.name = name;
		this.lastName = lastName;
		this.dob = dob;
		this.task = task;
	}
	
	public String toString() {
		return "Person\n"
				+ " | Name = " + name
				+ "\n | LastName = " + lastName
				+ "\n | Date of Birth = " + dob
				+ "\n | Task = " + task;
	}
	
	// convert yyyy from date -> string -> int
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	String d = sdf.format(date);
	int dateInt = Integer.valueOf(d);
	
	// public int age() -> use only the year of birth
	public int age(){
		return dateInt - dob;
	}
	
	// public virtual double salary()-> base Salary is 700;
	public double salary() {
		double salary = 700;
		return salary;
	}
	
}
