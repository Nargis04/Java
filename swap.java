package day_1;


import java.util.Scanner;

public class swap {
	public static void main(String[] args)
	{
		int a,b,temp;
		System.out.println("Enter numbers for swapping");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("Values after swapping");
		System.out.println(+a);
		System.out.println(+b);
		
		
	}

}
