package com.cg.eis.exception;

public class SalaryException extends Exception {
	private static final long serialVersionUID = 1L; 
	//purpose: if we don't declare, when we add or modify the fields in a class,
	//then already serialized class will not be able to recover

	public SalaryException() { // class constructor
		super("The employee's salary is less than 3000 "); // call super class
	}

}
