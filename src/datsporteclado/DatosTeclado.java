package datsporteclado;

import java.util.Scanner;

public class DatosTeclado {
	public static void main(String[] args) {
		
		int num;
		Scanner read=new Scanner (System.in);
		
		System.out.print("Introduzca un n�mero: ");
		num=read.nextInt();
		
		System.out.println("El n�mero que has introducido es: " + num);
		
	}

}
