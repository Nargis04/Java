package day_1;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,m=0;
		int flag=0;
		
System.out.println("Enter the number to check whether prime or not");
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
m=num/2;
for(int i=2 ;i<m;i++)
{
	if(num%i ==0)
	{
		System.out.println("Number is not prime");
		
	}
	flag=1;
	break;
}
if(flag==0)
{
	System.out.println("Number is prime");
}

	}

}
