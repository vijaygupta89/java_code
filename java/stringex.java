package examples;
                                ////2string input from user and find both string are same or not
import java.util.Scanner;

public class stringex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String a = sc.next();
		System.out.println("Retype your name");
		String b = sc.next();
		
		if(a.equals(b))
		{
			System.out.println("your name is matching.. ");
			
		}
		else
		{
			System.out.println(" Given name is not matching..");
		}

	}

}
