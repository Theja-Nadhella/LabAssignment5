/**Author: N Theja
 * Date: 2-11-2020
 * Desc: Creating an employee exception if salary < 3000
 */
package com.cg.eis.exception;
import java.util.Scanner;
public class EmployeeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary of employee");
		int salary = sc.nextInt(); //Salary input 
		try {
			//If salary is < 3000, then throw the exception
			if (salary < 3000) {
				throw new SalaryException();
			} else {
				System.out.println("Salary of the Employee is " + salary); // if salary > 3000 then print employee salary 
			}
		} catch (SalaryException e) {
			System.out.println(e.getMessage());// Display the exception 
		}
	}
}
