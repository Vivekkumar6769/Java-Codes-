/*4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, 
or "large" if it exceeds 1,000,000. */

package chap3;

import java.util.*;
//import java.math.*;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any floating Point Number");
		double f = sc.nextFloat();

		if (f > 0) {
			if (f < 1) {
				System.out.println("Positive Small Number");
			} else if (f > 1000000) {
				System.out.println("Positive Large Number");
			} else {
				System.out.println("Positive Number ");
			}
		}

		else if (f < 0) {
			if (Math.abs(f) < 1) {
				System.out.println("Small Negative Number");
			}
			else if (Math.abs(f) > 1000000) {
				System.out.println("Large Negative Number");
			} else {
				System.out.println("Negative Number");
			}
		}

		else {
			System.out.println("Zero");
		}

	}

}
