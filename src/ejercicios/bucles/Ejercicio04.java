package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
	/* Introduzco: 50, 25| Espero: El máximo común divisor es  25| Resultado: El máximo común divisor es  25
	 * Introduzco: 25, 50| Espero: El máximo común divisor es 25| Resultado: El máximo común divisor es  25
	 * Introduzco: 17, 2| Espero: Estos dos número no tienen máximo común divisor| Resultado: Estos dos número no tienen máximo común divisor
	 * 
	 */
	public static void main(String[] args) {
		//Variable para los dos número y el maximo comun divisor
		int num1 = 0, num2 = 0, mcd=0;
		
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
		} while(num1<=0);
				
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
		
		//Calculo el maximo comun divisor
		for(int i=num1; i>=2; i--) {
			if(num1%i==0) {
				if(num2%i==0) {
					mcd=i;
					break;
				}
			}
		}
		
		//Muestro el mcd
		if(mcd==0) {
			System.out.println("Estos dos número no tienen máximo común divisor");
		} else {
			System.out.println("El máximo común divisor es " + mcd);
		}
		
		//Cierro el Scanner
		sc.close();

	}

}
