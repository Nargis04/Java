package day_1;

import java.util.Scanner;

public class greatest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3;
System.out.println("Enter three numbers");
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
if(num1>=num2 && num1>=num3)
  {
	System.out.println("  greatest number is " +num1);
	}
	else
	   
		if(num2>=num1 && num2>=num3)
		{
			System.out.println(" greatest number is" +num2);
		}
		else
		  
		    if(num3>=num1 && num3>=num2)
		   {
		    	System.out.println("greatest number is " +num3);
		    }
			   	       	
}
	}


