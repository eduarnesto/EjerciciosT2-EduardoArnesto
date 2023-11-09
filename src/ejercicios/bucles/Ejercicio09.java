package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
	/* Introduzco: 1| Espero: | Resultado:
	 * Introduzco: 10| Espero: | Resultado:
	 * Introduzco: 34| Espero: | Resultado:
	 * Introduzco: 100| Espero: | Resultado:
	 * Introduzco: 123456| Espero: | Resultado:
	 * Introduzco: -4| Espero: | Resultado:
	 */
	public static void main(String[] args) {
		//Variable para número y dígitos que forman el número
		int num = -1, i;
		
		
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
		for(i=1; i<=num; Math.pow(10, i));
		
		//Muestro la cantidad de digitos del número
		System.out.println("El número " + num + " tiene " + i + " dígitos");
		
		//Cierro el Scanner
		sc.close();
	}

}
