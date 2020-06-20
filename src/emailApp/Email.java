package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int defaultPasswordLength = 10;
	private String companyName = "privateCompany.com";
	private int mailboxCapacity = 500;
	private String alternateEmail;
	
	
   	// Constructor to receive the firstName and lastName
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the Department - return a Department
		
		this.department = setDepartment();
		System.out.println("Department : " + this.department);
		
		//call a method that return random password
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("your password is : " + this.password);
		
		// Combine elements to generate emailId
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
		System.out.println("your email: " + email);
		
	}
	
	
	// Ask for the Department
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES : \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n ENTER CODE: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} 
		else if (depChoice == 2) {
			return "Development";
		}
		else if (depChoice == 3) {
			return "Accounting";
		}
		else {
			return " ";
		}
	}
	
	// Generate a random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
		char [] password = new char[length];
		for(int i=0; i<length;i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	// Set the mailbox capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name : "+ firstName + "  " + lastName + " ; " + "Company Email : " + email + " ; " + "Mailbox Capacity : " + mailboxCapacity;
	}
	
	
	
					
}

