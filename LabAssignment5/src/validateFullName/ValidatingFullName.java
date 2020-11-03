/** Author: N Theja
 * Date: 2-11-2020
 * Desc: Creating exception if First name and last name is blank
 */
package validateFullName;
import java.util.Scanner;
public class ValidatingFullName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Name");
		String firstName = sc.next(); // first name 
		
		System.out.println("Enter the Last Name");
		String lastName = sc.next(); // last name 
		try {
			//check the full name of an employee is blank or not 
			//if it is null, then throw Exception
			if (firstName.equals("null") || lastName.equals("null")) {
				throw new NameException("Please Enter valid First Name and Last Name of Employee!");
			} 
			else {
				System.out.println("The Full Name of Employee is " + firstName + " " + lastName +".");
			}
		} catch (NameException e) {			
			System.out.println(e.getMessage()); // print the exception

		}
	}

}
