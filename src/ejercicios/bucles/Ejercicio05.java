package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
	/* Introduzco: 50, 25| Espero: El mínimo común múltiplo es  50| Resultado: El mínimo común múltiplo es  50
	 * Introduzco: 25, 50| Espero: El mínimo común múltiplo es 50| Resultado: El mínimo común múltiplo es  50
	 * Introduzco: 17, 2| Espero: El mínimo común múltiplo es 14| Resultado: El mínimo común múltiplo es 14
	 * Introduzco: -5 | Espero: Pregunta el número otra vez | Resultado: Pregunta el número otra vez
	 */
	public static void main(String[] args) {
		//Variable para los dos número y el minimo comun multiplo
		int num1 = 0, num2 = 0, mcm=0;
		
		//Variable auxiliar para que el numero 1 sea el mayor numero
		int aux;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				//Pregunto por el primer número
				System.out.println("Introduzca el primer número");
				
				//Leo del teclado
				num1=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while (num1<=0);
				
		do {
			try {
				//Pregunto por el segundo número
				System.out.println("Introduzca el segundo número");
				
				//Leo del teclado
				num2=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while (num2<=0);
		
		//Hago que el num1 sea el mayor número
		if(num2>num1) {
			aux=num1;
			num1=num2;
			num2=aux;
		}
		
		//Calculo el minimo comun divisor
		for(int i=num1; i<=num1*num2; i++) {
			if(i%num1==0) {
				if(i%num2==0) {
					mcm=i;
					break;
				}
			}
		}
		
		//Muestro el mcm
		System.out.println("El mínimo común múltiplo es " + mcm);
		
		//Cierro el Scanner
		sc.close();

	}

}

