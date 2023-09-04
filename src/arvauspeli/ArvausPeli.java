package arvauspeli;

import java.util.Scanner;

public class ArvausPeli {
	public static void main(String[] args) {
		String name = "Vilhelmiina";
		String quit = "loppu";

		Scanner sc = new Scanner(System.in);		
		String input;
		int countGuesses = 0;
	
		System.out.println("Syötä \"" + quit + "\", kun haluat lopettaa.");
		while (true) {
			System.out.print("Arvaa nimi: ");
			input = sc.nextLine();
			
			if (input.equals(quit)) {
				System.out.println("Ok. Lopetetaan...");
				System.out.println("Ehdit tähän mennessä arvaamaan väärin " + countGuesses + " kertaa.");
				break;
			}
			
			countGuesses++;
			
			if (input.equals(name)) {
				System.out.println("Oikein!");
				System.out.println("Onneksi olkoon! Vastasit oikein vastauskerralla " + countGuesses + ".");
				break;
			}
			
			else {
				System.out.println("Väärin! Ei ollut " + input + ".");
			}
		} 
		
		System.out.println("Oikea nimi oli " + name + ".");
		
		sc.close();
	}
}
