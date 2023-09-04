package com.gl.email.main;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.*;

public class Driver {
		
		public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	ICredentialService service = new CredentialService();
	    	System.out.println("Enter the Employee First Name:");
	    	String firstName = sc.next();
	    	System.out.println("Enter the Employee Last Name:");
	    	String lastName = sc.next();
	    	Employee employee = new Employee(firstName, lastName); 
	    	System.out.println("Please select the employee department option:");
	    	System.out.println("1. Technical");
	    	System.out.println("2. Admin");
	    	System.out.println("3. Human Resource");
	    	System.out.println("4. Legal");
	    	int option = sc.nextInt();
	    	
			switch(option) {
	    	case 1 : employee.setDepartment("tech"); break;
	    	case 2 : employee.setDepartment("adm"); break;
	    	case 3 : employee.setDepartment("hr"); break;
	    	case 4 : employee.setDepartment("lg"); break;
	    	default : System.out.println("Please Enter Correct Option"); break;
	    	}

			if(employee.getFirstName() != null && employee.getLastName() != null && employee.getDepartment()!= null) {
				service.generateEmail(employee);
				service.generatePassword(employee);
				service.showCrendentials(employee);
				
			}else {
				System.out.println("Invalid EMployee Details");
			}
			sc.close();
	}

}
