package day_1;

import java.util.Scanner;

public class reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,rev=0;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num>0)
{
	rev=rev*10 + num%10;
	num=num/10;
	
}
System.out.println("Reverse of number is " + rev);
	}

}
