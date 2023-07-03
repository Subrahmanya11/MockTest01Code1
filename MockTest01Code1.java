//Write a java program to check whether a given number is positive, 
//negative or zero using an if else statement
package in.ineuron.com;

import java.util.Scanner;

public class MockTest01Code1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double i = sc.nextDouble();
		if(i>0)
			System.out.println(i +" is a positive number");
		else if(i<0)
			System.out.println(i+" is a negative number");
		else
			System.out.println("number is zero");

	}

}
