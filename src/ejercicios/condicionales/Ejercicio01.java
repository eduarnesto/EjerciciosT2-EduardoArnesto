package ejercicios.condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	
	/* Introduzco: 1| Espero: true| Resultado: true
	 * Introduzco: 11| Espero: true | Resultado: true
	 * Introduzco: 12| Espero: false | Resultado: false
	 * Introduzco: 121| Espero: true | Resultado: true
	 * Introduzco: 111| Espero: true | Resultado: true
	 * Introduzco: 123| Espero: false | Resultado: false
	 * Introduzco: 1111| Espero: true | Resultado: true
	 * Introduzco: 1221| Espero: true | Resultado: true
	 * Introduzco: 1231| Espero: false | Resultado: false
	 * Introduzco: 1223| Espero: false | Resultado: false
	 * Introduzco: 1234| Espero: false | Resultado: false
	 * Introduzco: -1| Espero: pide de nuevo un número  | Resultado: pide de nuevo un número
	 * Introduzco: 10000| Espero: pide de nuevo un número  | Resultado: pide de nuevo un número
	 */

	public static void main(String[] args) {
		//Variable para el número
		int num = -1;
		
		//Variables para número del revés
		int numreves = 0;
		
		//Variable para saber si es capicúa
		boolean capicua = false;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
			//Pregunto por el número
			System.out.println("Introduzca un número de 0-9999");
			
			//Leo del teclado
			num = sc.nextInt();
			
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while(num<0 || num>9999);
		
		//Compuebo si es capicua
		numreves=num%10;
		
		if(num>=10) {
			numreves=numreves*10;
			numreves+=num%100/10;
			
			if(num>=100) {
				numreves=numreves*10;
				numreves+=num%1000/100;
				
				if(num>=1000) {
					numreves=numreves*10;
					numreves+=num/1000;
				}
			}
		}
		if(num==numreves) {
			capicua=true;
		}
		System.out.println("¿El número introducido es capicúa?: " + capicua);
		
		//Cierro el Scanner
		sc.close();
	}
}
