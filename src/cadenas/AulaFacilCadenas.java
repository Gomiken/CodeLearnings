package cadenas;
import java.util.Scanner;

public class AulaFacilCadenas {
	
	public static void main(String[] args) {
		
		int n;
		Scanner leer = new Scanner (System.in);
		
		System.out.println("1. Opci�n 1");
		System.out.println("2. Opci�n 2");
		System.out.println("3. Opci�n 3");
		
		System.out.println("Elige una opci�n del men�: ");
		n= leer.nextInt();
		
		switch (n)
		{
		case 1:
			System.out.println("Has elegido la opci�n 1.");
			break;
		case 2:
			System.out.println("Has elegido la opci�n 2.");
			break;
		case 3:
			System.out.println("Has elegido la opci�n 3.");
			break;
		default:
			System.out.println("No has elegido ninguna opci�n del men�.");
			break;
		}
		
	}

}
