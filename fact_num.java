package day_1;

import java.util.Scanner;

public class fact_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = 1, num;
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num == 1) {
			fact = 1;
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
		}
		System.out.println("Factorial of "+num+" is " + fact);

	}

}
