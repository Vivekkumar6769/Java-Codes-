//Program to print prime numbers from 1 to 100

package chap3;
public class PrimeNumbers {
	public static void main(String args[]) {
		System.out.println("Prime Numbers from 1 to 100 are \n");
		int size = 100;
		
		for (int i = 2; i < size; i++) {
			int flag=1;
			for (int j = 2; j <=i / 2; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println(i);
			}
			

		}
	}
}
