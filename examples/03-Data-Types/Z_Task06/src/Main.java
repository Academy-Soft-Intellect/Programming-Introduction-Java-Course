import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Example:
		//The first string: This is Java!
		//The second string: Java
		
		System.out.println("The first string:");
		String firstString = input.nextLine();
		System.out.println("The first string:");
		String secondString = input.nextLine();
		
		boolean isSecondInsideFirst = firstString.contains(secondString);
		
		System.out.println("The first string contains the second String: " + isSecondInsideFirst);
		
		input.close();

	}

}
