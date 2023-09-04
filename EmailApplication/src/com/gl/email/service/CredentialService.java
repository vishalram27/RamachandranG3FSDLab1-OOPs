package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialService implements ICredentialService{

	@Override
	public void generateEmail(Employee employee) {
		String emailAddress = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + employee.getDepartment().toLowerCase() + "." + "gl.in";
		employee.setEmailAddress(emailAddress);
		
	}

	@Override
	public void generatePassword(Employee employee) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+{}[];:'\",.<>/?";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        employee.setPassword(password);
        
        return;
    }

	@Override
	public void showCrendentials(Employee employee) {
		
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Generated Email Address \t \t: " + employee.getEmailAddress());
		System.out.println("Generated Password \t \t: " + employee.getPassword());
	}

}
