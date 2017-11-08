package datsporteclado;

import java.util.Scanner;

public class DatosTeclado {
	public static void main(String[] args) {
		
		int num;
		Scanner read=new Scanner (System.in);
		
		System.out.print("Introduzca un número: ");
		num=read.nextInt();
		
		System.out.println("El número que has introducido es: " + num);
		
	}

}
