package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
	/* Introduzco: 1| Espero: El número 1 tiene 1 digito| Resultado: El número 1 tiene 1 digito
	 * Introduzco: 10| Espero: El número 10 tiene 2 digitos| Resultado: El número 10 tiene 2 digitos
	 * Introduzco: 34| Espero: El número 34 tiene 2 digitos| Resultado: El número 34 tiene 2 digitos
	 * Introduzco: 100| Espero: El número 100 tiene 3 digitos| Resultado: El número 100 tiene 3 digitos
	 * Introduzco: 123456| Espero: El número 123456 tiene 6 digitos| Resultado: El número 123456 tiene 6 digitos
	 * Introduzco: -4| Espero: Valor introducido no válido y vuelve a preguntar| Resultado: Valor introducido no válido y vuelve a preguntar
	 */
	public static void main(String[] args) {
		//Variable para número y dígitos que forman el número
		int num = 0, dig=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				//Pregunto por el número
				System.out.println("Introduce un número mayor que 0");
				
				//Leo del teclado
				num=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while (num<=0);
		
		//Compruebo cuantos digitos tiene el número
		for(int i=1; i<=num; i*=10) {
			dig++;
		}
		
		//Muestro la cantidad de digitos del número
		System.out.println("El número " + num + " tiene " + dig + " dígitos");
		
		//Cierro el Scanner
		sc.close();
	}

}
