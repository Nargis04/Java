package day_1;

import java.util.Scanner;

public class pow_num {
	public static void main(String[] args)
	{
		int num,pow,num1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Enter power");
		pow=sc.nextInt();
		for(int i=1;i<=pow;i++)
		{
			num1=num1*num;
		}
		System.out.println(+num1);
		
	}

}
