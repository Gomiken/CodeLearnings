package ej2;
import java.util.Scanner;

public class Ejercicio2 {
	
	
	static void mostrarNumeros() {
		
		System.out.println("Has elegido la opci�n 1.");
		int num;
			
		System.out.print("Introduzca un n�mero: ");
		Scanner leer = new Scanner (System.in);
		num = leer.nextInt();
			
		for (int i = 0; i <= num; i++) {
		System.out.println(i);
		}
	}
	static void Edad() {
			System.out.println("Has elegido la opci�n 2.");
			int edad;
			
			System.out.print("Introduzca su edad: ");
			Scanner leer = new Scanner (System.in);
			edad = leer.nextInt();
			
			if(edad >= 18) {
				System.out.println("Es mayor de edad.");
			} else {
				System.out.println("No es mayor de edad.");
			}
				
		}
		

	public static void main(String[] args) {
	
	int n;
	Scanner leer = new Scanner (System.in);
	
	System.out.println("1. Mostrar n�meros");
	System.out.println("2. Comprobaci�n edad");
	
	System.out.println("Elige una opci�n del men�: ");
	n= leer.nextInt();
	
		if (n == 1) {
			mostrarNumeros();
		} else {
			Edad();
		}
	}
}
