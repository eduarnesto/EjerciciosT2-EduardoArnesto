package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
	/* Introduzco: 2| Espero: 
	 * 1
	 * 121
	 * 12321
	 * Resultado:
	 * 1
	 * 121
	 * 12321 
	 * Introduzco: -5 | Espero: Pregunta el número otra vez | Resultado: Pregunta el número otra vez
	 */
	public static void main(String[] args) {
		//Variable para guardar el numero
		int num = 0;
		
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
		} while(num<0);
		
		//Muestro la pirámide de números
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			for(int k=i-1; k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		//Cierro el scanner
		sc.close();
		

	}

}
