package examples;

import java.util.Scanner;

public class findstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		
		String s1 = sc.next();
		
		System.out.println("Retype your name");
		
		String s2 = sc.next();
		
		if(s1.contains(s2))
		{
			System.out.println("contains same string.. ");
			
		}
		else
		{
			System.out.println("its not contains same string  ..");
		}

	}

	}


