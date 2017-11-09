package examendni;

import java.util.Scanner;

/**
 * Created by Gomiken on 09-nov-2017.
 * Laser Cat Games
 */
public class CalcularLetraDNIB {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Intruduce un DNI sin letra (ej: 23951340)");
        int dni = leer.nextInt();
        System.out.print("La letra del DNI es: ");
        System.out.println(calcularLetraDNI(dni));        
    }
    
    static char calcularLetraDNI(int dni) {
        
        char[] letras = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
            'L', 'C', 'K', 'E'
        };
        int modDni = dni % 23;
        
        return letras[modDni];
    }
}