package ejemploarrays;

public class IndiceArrays {
	
		public static void main(String[] args) {
			
			int[] numeros; //Un array de numeros enteros
			int i;
			numeros = new int[5]; //Array de 5 elementos, del 0 al 4.
			
			//Valor de cada elemento del Array
			numeros[0] = 23;
			numeros[1] = 5;
			numeros[2] = 300;
			numeros[3] = 12;
			numeros[4] = 79;
			
			//Se muestran por consola.
			for (i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}
		}

}
