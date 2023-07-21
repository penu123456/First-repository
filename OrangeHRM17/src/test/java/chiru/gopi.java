package chiru;

import org.testng.annotations.Test;


public class gopi {
	

	public static void main(String[] args) {
		
		int x=0,y=0;
		
		x=sum(10,20);
		
	
		System.out.println("Sum of two numbers is :"+x);
		
		y=mul(10,20);
		
		
		System.out.println("Multiplicaion of two numbers is :"+y);

	}
	
	public static int sum(int a, int b) {
		 
		int x=a+b;
		
		return x;
		
	}
	
	public static int mul(int d,int e) {
		
		int y=d*e;
		
		return y;
		
		
	}

}
