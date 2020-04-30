package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}, "repeat");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			System.out.println("");
			String output = "";
			for (int i = 0; i < s.length(); i++) {

				if (i % 2 == 0) {
					output += Character.toUpperCase(s.charAt(i));
				} 
				else {

				}
			}
			System.out.println(output);
		}, "repeat");
		
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
