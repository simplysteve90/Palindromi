package it.dstech;

import java.util.Scanner;

public class Palindromi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci la frase da analizzare");
		String stringa = scanner.nextLine();
		char[] array = stringa.toCharArray();
		String str = "";
		for (int i = stringa.length() - 1; i >= 0; i--) {
			str = str + array[i];
		}
		if (stringa.equalsIgnoreCase(str))
			System.out.println("La Frase e' palindroma");
		else
			System.out.println("La Frase non e' palindroma");
		scanner.close();

	}

}
