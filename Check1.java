//Take values of length and breadth of a rectangle from user and check if it is square or not.

package chap3;

import java.util.*;

public class Check1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int l = sc.nextInt();
		System.out.println("enter breadth");
		int b = sc.nextInt();

		if (l == b) {
			System.out.println("Yup! It's a Square");

		} else {
			System.out.println("No! Not a Square");

		}

	}

}
