package arraysmulti;

public class ArraysMulti {
	
	public static void main(String[] args) {
		
		int [] [] numeros; //Array multidimensional de numeros enteros.
		int i, j; //Recorrer el array con i = filas, j = columnas
		
		//Array con dos filas y tres columnas.
		numeros = new int [2] [3]; //Se dan los número de filas y columnas.
		
		for (i = 0; i < numeros.length; i++) { //Recorre las filas.
			for (j= 0; j < numeros[i].length; j++) {//De cada fila recorre todas sus columnas.
				
				System.out.print(numeros[i] [j] + " "); //Muestra elementos de una fila
			}
			
			System.out.println("\n"); // \n es un salo de linea para mostrar la fila de abajo.
		}
	}

}
