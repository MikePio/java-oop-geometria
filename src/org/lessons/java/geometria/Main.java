package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Inserisci la base del rettangolo: ");
//        int base = sc.nextInt();
//
//        System.out.print("Inserisci l'altezza del rettangolo: ");
//        int altezza = sc.nextInt();

		Rettangolo rettangoloPiccolo = new Rettangolo(20, 10);
        
		rettangoloPiccolo.calcolaArea();
		rettangoloPiccolo.calcolaPerimetro();
		
//        sc.close();
	}
	

	
	
	
}
