package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
	/*
	 * 
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
