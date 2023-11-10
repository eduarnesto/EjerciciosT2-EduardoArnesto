package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	/* Introduzco: | Espero: | Resultado: 
	 * 
	 */
	public static void main(String[] args) {
		//Variable para guardar el numero y los numeros primos
		int num = 0, primos=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				//Pregunto por un numero
				System.out.println("Introduzca un número");
				
				//Leo del teclado
				num=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while(num<1);
		
		//Calculo el numero de primos entre 1 y el numero en cuestion
		for(int i=2; i<num; i++) {
			primos++;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					primos--;
					break;
				}
			}
		}
		
		//Muestro la cantidad de numeros primos
		System.out.println("Entre 1 y " + num + " hay " + primos + " números primos");
		
		//Cierro el Scanner
		sc.close();

	}

}
