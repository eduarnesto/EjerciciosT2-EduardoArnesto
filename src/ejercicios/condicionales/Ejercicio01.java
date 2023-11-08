package ejercicios.condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	
	/*Introduzco: pepe| Espero: | Resultado:
	 * Introduzco: | Espero: | Resultado:
	 */

	public static void main(String[] args) {
		//Variable para el número
		int num = 0;
		
		//Variable para saber si un valor es válido
		boolean valid = false;
		
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
			valid=true;
			
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while(!valid);
		
		//Compuebo si es capicua
		if(num>=0 && num<=9999) {
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
		} else {
			System.out.println("Valor introducido no es capicúa");
		}
		
		//Cierro el Scanner
		sc.close();
	}
}
