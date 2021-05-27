package day_1;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int rem,temp,sum=0,num;
		  System.out.println("Enter number");
		  Scanner sc= new Scanner(System.in);
		  num=sc.nextInt();
		  
		  temp=num;
		  while(num>0)
		  {
		     rem=num%10;
		     sum=sum+(rem*rem*rem);
		     num=num/10;
		  }
		  if(sum==temp)
		  {
			  System.out.println("Number is Armstrong number");
			  
		  }
		  else
		  {
			  System.out.println("Number is not Armstrong number");
		  }
	}

}
