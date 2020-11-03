/** Author:N Theja
 * Date: 2-11-2020
 * Desc: creating an exception if age of a person < 15 years
 */
package validatingAge;
import java.util.Scanner;
public class ValidatingAgeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of a person(in years): ");
		int age = sc.nextInt();
		try {
		 //if age <15, throw an exception
			if (age > 15) {
				System.out.println("The person is " + age +"years old.");
			} else {
				throw new AgeException(); //InvalidAgeException class
			}
		} catch (AgeException e) {
			System.out.println(e.getMessage()); //display exception
			}
}
}
