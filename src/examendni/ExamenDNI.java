package examendni;
import java.util.Scanner;
/*Haz un programa Java que pida al usuario que introduzca un DNI sin la letra (ej: 23951314). Mediante el uso de un metódo
*tienes que calcular la letra de ese DNI y mostrarla por pantalla.

*Aquí tienes el procedimiento escrito de como se calcular la letra de un DNI: https://www.letranif.com/formula-para-calcular-la-letra-del-dni/

*Al acabar sube los cambios al Repositorio GitHub.

*Ale!.*/

public class ExamenDNI {
	
	static Scanner leer = new Scanner(System.in);
	static int dni;
	
	static void letraDNI () {
		
		int n, resultado;
		n = 23;
		resultado = dni % n;
		
		
		switch (resultado) {
		case 0:
			System.out.println("La letra que corresponde al DNI es la T.");
			break;
		case 1:
			System.out.println("La letra que corresponde al DNI es la R.");
			break;
		case 2:
			System.out.println("La letra que corresponde al DNI es la W.");
			break;
		case 3:
			System.out.println("La letra que corresponde al DNI es la A.");
			break;
		case 4:
			System.out.println("La letra que corresponde al DNI es la G.");
			break;
		case 5:
			System.out.println("La letra que corresponde al DNI es la M.");
			break;
		case 6:
			System.out.println("La letra que corresponde al DNI es la Y.");
			break;
		case 7:
			System.out.println("La letra que corresponde al DNI es la F.");
			break;
		case 8:
			System.out.println("La letra que corresponde al DNI es la P.");
			break;
		case 9:
			System.out.println("La letra que corresponde al DNI es la D.");
			break;
		case 10:
			System.out.println("La letra que corresponde al DNI es la X.");
			break;
		case 11:
			System.out.println("La letra que corresponde al DNI es la B.");
			break;
		case 12:
			System.out.println("La letra que corresponde al DNI es la N.");
			break;
		case 13:
			System.out.println("La letra que corresponde al DNI es la J.");
			break;
		case 14:
			System.out.println("La letra que corresponde al DNI es la Z.");
			break;
		case 15:
			System.out.println("La letra que corresponde al DNI es la S.");
			break;
		case 16:
			System.out.println("La letra que corresponde al DNI es la Q.");
			break;
		case 17:
			System.out.println("La letra que corresponde al DNI es la V.");
			break;
		case 18:
			System.out.println("La letra que corresponde al DNI es la H.");
			break;
		case 19:
			System.out.println("La letra que corresponde al DNI es la L.");
			break;
		case 20:
			System.out.println("La letra que corresponde al DNI es la C.");
			break;
		case 21:
			System.out.println("La letra que corresponde al DNI es la K.");
			break;
		case 22:
			System.out.println("La letra que corresponde al DNI es la E.");
			break;
			
		default:
			System.out.println("El número del DNI no es correcto.");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca su número del DNI (sin la letra): ");
		dni = leer.nextInt();
		
		letraDNI();
		
	}
	


}
