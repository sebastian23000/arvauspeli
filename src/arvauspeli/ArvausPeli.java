package arvauspeli;

import java.util.Scanner;
import java.util.Random;

public class ArvausPeli {
	public static void main(String[] args) {
		String[] names = {
			"Aila", "Aili", "Alvar", "Ansa", "Arho", "Arja", "Auno",
			"Eevert",
			"Hellevi", "Hilla", "Hillevi",
			"Iida", "IIta", "Isla", "Isto",
			"Justus",
			"Kaleva", "Kalevi", "Kuisma", "Kullervo",
			"Lenni",
			"Mainio", "Mauri", "Mervi", "Mielikki", "Miisa", "Mika", "Mikael", "Mikko", "Milo", "Minja", "Miro",
			"Orvo",
			"Pirkka",
			"Reija", "Roni",
			"Sandra", "Santeri", "Santtu", "Sirja", "Siru", "Sini", "Sinikka", "Sirpa", "Soila", "Soile", "Soili", "Sorja",
			"Taimi", "Tytti", "Tyyne", "Tyyni",
			"Valma", "Varpu", "Vaula", "Vertti", "Vesa", "Vilja"
		};
		
		Random rn = new Random();
		String name = names[rn.nextInt(names.length)];
		String quit = "loppu";

		Scanner sc = new Scanner(System.in);		
		String input;
		int countGuesses = 0;
		int nameLength = name.length();
	
		System.out.println("Syötä \"" + quit + "\", kun haluat lopettaa.");
		while (true) {
			System.out.println("Sinulla on " + (nameLength*3 - countGuesses) + " yritystä.");
			System.out.print("Arvaa nimi: ");
			input = sc.nextLine();
			
			if (input.equalsIgnoreCase(quit)) {
				System.out.println("Ok. Lopetetaan...");
				System.out.println("Ehdit tähän mennessä arvaamaan väärin " + countGuesses + " kertaa.");
				break;
			}
			
			countGuesses++;
			
			if (input.equalsIgnoreCase(name)) {
				System.out.println("Oikein!");
				System.out.println("Onneksi olkoon! Vastasit oikein vastauskerralla " + countGuesses + ".");
				break;
			}
			
			else {
				System.out.println("Väärin! Ei ollut " + input + ".");
				
				if (countGuesses >= nameLength*3) {
					System.out.println("Hävisit pelin, koska sinulla ei ole enään arvauskertoja.");
					System.out.println("Ehdit tähän mennessä arvaamaan väärin " + countGuesses + " kertaa.");
					break;
				}
				
				//User get's a hint after 2nd wrong guess.
				if (countGuesses == 2) {
					System.out.println("Vinkki: Nimessä on " + nameLength + " kirjainta.");
				}
				
				//User get's a hint every 3th wrong guess.
				if (countGuesses%3 == 0) {
					System.out.println("Vinkki: Nimi alkaa kirjaimilla \"" + name.substring(0, countGuesses/3) + "\".");
				}
			}
		} 
		
		System.out.println("Oikea nimi oli " + name + ".");
		
		sc.close();
	}
}
