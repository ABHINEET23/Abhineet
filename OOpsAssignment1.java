
package test;

public class Person1 {

	int pid;
	String pName;
	String pAddress;

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
		
}

package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


class Employee extends person1{
	String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPfDedudction() {
		return pfDedudction;
	}
	public void setPfDedudction(double pfDedudction) {
		this.pfDedudction = pfDedudction;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOf_Joining() {
		return dateOf_Joining;
	}
	public void setDateOf_Joining(String dateOf_Joining) {
		this.dateOf_Joining = dateOf_Joining;
	}
	public String getDateOf_Registration() {
		return dateOf_Registration;
	}
	public void setDateOf_Registration(String dateOf_Registration) {
		this.dateOf_Registration = dateOf_Registration;
	}
	String location;
	double salary;
	double pfDedudction;
	String post;
	String email;
	String dateOf_Joining;
	String dateOf_Registration;
	
	public void showEmp()
	{
		System.out.println("Emp Name :-" +pName+"   " +"Emp ID :-"+ pid+"   "  +"Dept:- "+deptName+"   " +"Email :- "+email+"   " +"Loaction :-"+location+"   " +"Salary :-"+salary+"   " +"Designation :- "+post+"   " +"DOJ :- "+dateOf_Joining );

	}
}

class Customer extends person1

{
	String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoRegistration() {
		return doRegistration;
	}
	public void setDoRegistration(String doRegistration) {
		this.doRegistration = doRegistration;
	}
	String doRegistration;
	public void showCust()
	{
		System.out.println("Customer Emai:-"+ email+"  "+"Customer id :- "+pid+"   "+"customer register date:-"+"  "+doRegistration);
	}
}

class Person{
	public static void main (String s[])
	{
		
Employee e = new Employee();
e.setPid(101);
		e.setpName("Abhineet");
		e.setpAddress("Pune");
		e.setDeptName("BG4");
        e.setEmail("abhineet@yash.com");	
        e.setpAddress("viman-nagar");
        e.setPfDedudction(1200.00);
        e.setPost("ML");
        e.setDateOf_Joining("Aug 15");
        e.setDateOf_Registration("Aug 25");
        e.setSalary(25000);
        
       		
        Customer c = new Customer();

c.setPid(222);
c.setEmail("av@gmail.com");
c.setpAddress("Pune");
c.setpName("Abhineet");
c.setDoRegistration("aug 22");



e.showEmp();
c.showCust();



}
}