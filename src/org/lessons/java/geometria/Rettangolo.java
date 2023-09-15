package org.lessons.java.geometria;

public class Rettangolo {
	
	public int base;
	public int altezza;
	
	// costruttore (ha lo stesso nome della classe)
	public Rettangolo(int base, int altezza){
		
		this.base = base;
		this.altezza = altezza;		
	}
	
	//metodo
	int calcolaArea(){
		
		int area = base * altezza;	
		System.out.println("Area: " + area);
		return area;
	}
	
	//metodo
	public void calcolaPerimetro() {
		int perimetro = (base + altezza)*2;
		System.out.println("Perimetro: " + perimetro);
	}
}
