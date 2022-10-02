/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100
Judge and print total cost for user.*/

package chap3;
import java.util.*;
public class Check2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total unit you want to buy");
         int u=sc.nextInt();
         if((u*100)>1000) {
        	 System.out.print("Hurrah! You have got 10% Discount.\nYour total price is ");
        	 double sum=(u*100)-(0.1*(u*100));
        	 System.out.print("Rs"+sum);
         }
         else {
        	 System.out.println("Sorry! You have got no discount\nYour total price is "+(u*100));
         }
	}

}
