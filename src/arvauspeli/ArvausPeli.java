package arvauspeli;

import java.util.Scanner;

public class ArvausPeli {
	public static void main(String[] args) {
		String name = "Vilhelmiina";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Arvaa nimi:");
		String input = sc.nextLine();
	
		if (input.equals(name)) {
			System.out.println("Onneksi olkoon! Arvasit nimen oikein.");
		}
		
		else {
			System.out.println("Väärin.");
		}
		
		System.out.println("Oikea nimi oli " + name + ".");
	}
}
