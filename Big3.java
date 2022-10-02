//Take three numbers from the user and print the greatest number
package chap3;
import java.util.*;
public class Big3 {
   public static void main(String args[]) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter any three numbers");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int c=sc.nextInt();
	   
	    if(a > b && a > c) {
	    	System.out.println("Greatest Number among them is "+ a);
	    }
	    else if(b>a && b>c) {
	    	System.out.println("Greatest Number among them is "+ b);
	    }
	    else {
	    	System.out.println("Greatest Number among them is "+ c);
	    }
	
}
}
