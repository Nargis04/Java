package day_1;

public class compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int  p=20000;
	double r=0.06;
	int t=3;
	int n=12;
	
	        double amount = p * Math.pow(1 + (r / n), n * t);
	        double cinterest = amount - p;
	        System.out.println("Compound Interest after " + t + " years: "+cinterest);
	        System.out.println("Amount after " + t + " years: "+amount);
	    }
	    
	    }

	


