package chap3;

public class AddDigit {

	public static void main(String[] args) {
		int a = 176;
		int sum = 0;
		int flag = 1;
		while (flag == 1) {
			sum = sum + (a % 10);
			a = a / 10;
			if (a < 10) {
				flag = 0;
			}
		}
		sum += a;
		System.out.println(sum);

	}

}
