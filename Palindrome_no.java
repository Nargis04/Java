package day_1;

import java.util.Scanner;

public class Palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,rev=0;
System.out.println("Enter number to check palindrome or not");
Scanner sc=new Scanner(System.in);
num = sc.nextInt();
int num1=num;
while(num>0)
{
	rev=rev*10 +num%10;
	num=num/10;
	
}
if(num1==rev)
{
	System.out.println("Number is palindrome");
	
}
else {System.out.println("Number is not palindrome");
	}

	}
}
