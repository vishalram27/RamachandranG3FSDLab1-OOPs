package com.gl.email.service;

import com.gl.email.model.Employee;

public interface ICredentialService {

	public void generateEmail(Employee employee);
	public void generatePassword(Employee employee);
	public void showCrendentials(Employee employee);

}
