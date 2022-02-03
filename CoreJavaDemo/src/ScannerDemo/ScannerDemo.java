package ScannerDemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //    java.util.Scanner sc = new java.util.Scanner(System.in);
     
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		System.out.println("number enter is " + number);
		
		System.out.println("do you want to co::ntue(y/n):");
		char option=scan.next().charAt(0);
		
		System.out.println("option entered is :" + option);
		
		dispay(number);
		
		//helolo
		
	}
public static void dispay(int number) {
	System.out.println(number + "is displayed in a method");
	
    if (number > 2 );
			System.out.println("this is greater then two"+ number);{
			} 
				{
	    System.out.println("this is not greater then two");
				}
				
    
}
		

	
}

