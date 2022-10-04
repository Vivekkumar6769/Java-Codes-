/* Write a Java program that reads any  two floating-point numbers and 
 * tests whether they are the same up to three decimal places. 
 */

package chap3;

import java.util.*;
import java.math.BigDecimal;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Floating Point Numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		int a1 = (int) a, b1 = (int) b;
		BigDecimal sum1=new BigDecimal(a).subtract(new BigDecimal(a1));
		BigDecimal sum2=new BigDecimal(b).subtract(new BigDecimal(b1));
		
		sum1=sum1.setScale(3, BigDecimal.ROUND_FLOOR);//CONVERTING TO 3 DECIMAL PLACES
		sum2=sum2.setScale(3, BigDecimal.ROUND_FLOOR);//CONVERTING TO 3 DECIMAL PLACES
		
		System.out.println("Sum1=" + sum1 + "    Sum2=" + sum2);

		if (sum1.equals(sum2)) {
			System.out.println("Great! Both have same digit till 3 decimal places");
		} else {
			System.out.println("Opps! Both are not same.....");
		}

	}

}
