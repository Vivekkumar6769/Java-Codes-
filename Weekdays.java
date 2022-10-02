/*5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and
 *  displays the name of the weekday. */

package chap3;

import java.util.*;

public class Weekdays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while (flag == 1) {
			System.out.println("Enter any number between 1 to 7");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Its Monday");
				break;
			case 2:
				System.out.println("Its Tuesday");
				break;
			case 3:
				System.out.println("Its Wednesday");
				break;
			case 4:
				System.out.println("Its Thursday");
				break;
			case 5:
				System.out.println("Its Friday");
				break;
			case 6:
				System.out.println("Its Saturday");
				break;
			case 7:
				System.out.println("Its Sunday");
				break;
			default:
				System.out.println("Invalid Response!!!!!! ");
			}
			System.out.println("Want to Try Again!!! \nPress 1 to try again OR Press 0 to exit !!");
			int i = sc.nextInt();
			flag = i;
		}

	}

}
