package cadenas;
import java.util.Scanner;

public class AulaFacilCadenas {
	
	public static void main(String[] args) {
		
		int n;
		Scanner leer = new Scanner (System.in);
		
		System.out.println("1. Opción 1");
		System.out.println("2. Opción 2");
		System.out.println("3. Opción 3");
		
		System.out.println("Elige una opción del menú: ");
		n= leer.nextInt();
		
		switch (n)
		{
		case 1:
			System.out.println("Has elegido la opción 1.");
			break;
		case 2:
			System.out.println("Has elegido la opción 2.");
			break;
		case 3:
			System.out.println("Has elegido la opción 3.");
			break;
		default:
			System.out.println("No has elegido ninguna opción del menú.");
			break;
		}
		
	}

}
