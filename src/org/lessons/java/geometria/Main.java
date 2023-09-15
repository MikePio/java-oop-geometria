package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		       
        Rettangolo[] rettangoli = new Rettangolo[3];
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcola l'area e il perimetro di 3 rettangoli");
		
		for(int i = 0;i < rettangoli.length;i++) {				
				
			System.out.print("Inserisci la base del rettangolo " + (i+1) + ": ");
	        int base = sc.nextInt();
	
	        System.out.print("Inserisci l'altezza del rettangolo " + (i+1) + ": ");
	        int altezza = sc.nextInt();
	        
	        rettangoli[i] = new Rettangolo(base, altezza);
	        
	        rettangoli[i].calcolaArea();
	        rettangoli[i].calcolaPerimetro();
        
		}
		
//		Rettangolo rettangoloPiccolo = new Rettangolo(20, 10);
   
//		rettangoloPiccolo.calcolaArea();
//		rettangoloPiccolo.calcolaPerimetro();
		
		System.out.println("Fine");
        sc.close();
	}
	

	
	
	
}
