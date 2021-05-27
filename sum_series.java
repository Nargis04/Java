package day_1;

import java.util.Scanner;

public class sum_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
float result=0;
System.out.println("Enter Nth term");
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
 result= num * (num+1)/2;
System.out.println("Sum of number till Nth term is " +result);

	}

}
