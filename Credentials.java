package com.greatlearning.interfaces;

import com.greatlearning.model.Employee;

public interface Credentials {
	
	public String generateEmailAdderess(String firstName, String lastName, String department);
	
	public String generatePassword();
	
	public void showCredentials(Employee emp);

}