package examples;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter your text :");
		
		StringBuilder sb = new StringBuilder();
		sb.append(sc.nextLine());
		
		System.out.println(sb.reverse());
		String s = sb.toString();
		
		System.out.println("upper case ="+s.toUpperCase());
		

	}

}
