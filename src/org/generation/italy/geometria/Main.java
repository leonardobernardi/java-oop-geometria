package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Base: ");
		int base = input.nextInt();
		System.out.print("Altezza: ");
		int altezza = input.nextInt();
		
		
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
		System.out.println("Area: " + rettangolo.calcolaArea());
		
		
		input.close();

	}

}
