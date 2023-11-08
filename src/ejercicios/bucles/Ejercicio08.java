package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {
	/* Introduzco: | Espero: | Resultado:
	 * Introduzco: | Espero: | Resultado:
	 * Introduzco: | Espero: | Resultado:
	 */
	public static void main(String[] args) {
		//Variable para número, numero mayor y contador para fallos y numeros introducidos
		int num = 1, mayor, fallos=0, numeros=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				//Pregunto por el número
				System.out.println("Introduce un número inicial:");
				
				//Leo del teclado
				num=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while (num<0);
		
		//Asigno un valor al mayor
		mayor=num;
		
		//Pregunto por los números
		do {
			System.out.println("Introduce un número:");
			num=sc.nextInt();
			if(num==0) {
				break;
			}
			numeros++;
			if(num>mayor) {
				mayor=num;
			} else {
				fallos++;
				System.out.println("Fallo, es menor.");
			}
		}while(num!=0);
		
		//Muestro el total de números introducidos
		System.out.println("Total de números introducidos: " + numeros);
		
		//Muestro el total de fallos introducidos
		System.out.println("Números fallados: " + fallos);
		
		//Cierro el Scanner
		sc.close();
	}

}
