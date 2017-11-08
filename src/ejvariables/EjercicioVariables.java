package ejvariables;

import java.util.Scanner;

public class EjercicioVariables {
	public static void main(String[] args) {
	
	int num1, num2, resultado; //Esto define 3 casas en la memoria ram
	Scanner read=new Scanner (System.in);
	
	System.out.print("Introduzca un número para num1: ");
	num1 =read.nextInt(); //Esto le pone chicha a la casa num1 (num1 es la dirección de la casa)
	System.out.print("Introduzca un número para num2: ");
	num2 =read.nextInt(); //Esto le pone chicha a la casa num2 (num2 es la dirección de la casa)
	resultado = num1 + num2;
	
	System.out.println("El número para num1 que has introducido es: " + num1);
	System.out.println("El número para num2 que has introducido es: " + num2);
	
	System.out.println("El resultado de sumar num1 y num2 es: " + resultado);
	
	//Finalmente resultado es una casa donde reside la suma de las dos anteriores casas.
	//Tu puedes hacer que resultado sea una casa diferente siempre que quieras, la dirección ya existe
	
	resultado = num1 * num2;
	
	System.out.println("El resultado de multiplicar num1 y num2 es: " + resultado);
	//Ahora resultado deja de ser la suma de las dos casas anteriores y ahora es la multiplicación
	
	resultado = num1 / num2;
	
	System.out.println("El resultado de dividir num1 y num2 es: " + resultado);
	
	}
}
