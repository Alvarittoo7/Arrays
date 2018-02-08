package arrays1;

import java.util.Scanner;

public class arrays4 {
	static int notas [];
	static Scanner sc;
	
	public static void pedirNotas (int Cantidad) {
		notas = new int [Cantidad];
		for(int i = 0; i<Cantidad; i++) {
			System.out.println("Introduzca nota ");
			notas[i] = sc.nextInt();
		}
	}
	
	public static void calcularMedia () {
		System.out.println("La nota media de las notas es: ");
		//Introduce tu código
	}
	
	public static void main (String[] args) {
		System.out.println("¿Cuántas notas vas a introducir?");
		sc = new Scanner(System.in);
		int elementos = sc.nextInt();
		
		pedirNotas(elementos);
		calcularMedia();
	}
}
