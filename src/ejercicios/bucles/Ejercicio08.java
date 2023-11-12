package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {
	/* Introduzco: 1, 0| Espero: Total de números introducidos: 1 Números fallados: 0| Resultado: Total de números introducidos: 1 Números fallados: 0
	 * Introduzco: 1, 10, 0| Espero: Total de números introducidos: 2 Números fallados: 0| Resultado: Total de números introducidos: 2 Números fallados: 0
	 * Introduzco: 1, 10, 1, 0| Espero: Total de números introducidos: 3 Números fallados: 1| Resultado: Total de números introducidos: 3 Números fallados: 1
	 * Introduzco: 0| Espero: Total de números introducidos: 0 Números fallados: 0| Resultado: Total de números introducidos: 0 Números fallados: 0
	 */
	public static void main(String[] args) {
		//Variable para número, numero mayor y contador para fallos y numeros introducidos
		int num = 1, mayor, fallos=0, numeros=0;
		
		//Variable para saber si el numero es válido
		boolean valid=true;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				//Pregunto por el número
				System.out.println("Introduce un número inicial:");
				
				//Leo del teclado
				num=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no válido");
				valid=false;
				sc.next();
			}
		} while (!valid);
		
		//Asigno un valor al mayor
		mayor=num;
		
		//Pregunto por los números
		while(num!=0) {
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
		}
		
		//Muestro el total de números introducidos
		System.out.println("Total de números introducidos: " + numeros);
		
		//Muestro el total de fallos introducidos
		System.out.println("Números fallados: " + fallos);
		
		//Cierro el Scanner
		sc.close();
	}

}
