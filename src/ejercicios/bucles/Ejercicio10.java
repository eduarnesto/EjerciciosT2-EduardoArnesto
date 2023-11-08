package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	/* Introduzco: 1| Espero: | Resultado:
	 * Introduzco: 11| Espero: | Resultado:
	 * Introduzco: 12| Espero: | Resultado:
	 * Introduzco: 121| Espero: | Resultado:
	 * Introduzco: 111| Espero: | Resultado:
	 * Introduzco: 123| Espero: | Resultado:
	 * Introduzco: 1111| Espero: | Resultado:
	 * Introduzco: 1221| Espero: | Resultado:
	 * Introduzco: 1231| Espero: | Resultado:
	 * Introduzco: 1223| Espero: | Resultado:
	 * Introduzco: 1234| Espero: | Resultado:
	 * Introduzco: -1| Espero: | Resultado:
	 * Introduzco: 10000| Espero: | Resultado:
	 */
	public static void main(String[] args) {
		//Variable para el número
		int num = 0, numreves = 0;
		
		//Variables para número del revés
		int cont1=10;
		
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
		} while (num<0||num>9999);
		
		//Compuebo si es capicua
		if(num>=0 && num<=9999) {
			
			for (int i=1; i<=num; i=i*10) {
				numreves=numreves*10;
				numreves+=num%cont1/i;
				cont1=cont1*10;
			}
			
			if(num==numreves) {
				capicua=true;
			}
			System.out.println("¿El número introducido es válido?: " + capicua);
		} else {
			System.out.println("Valor introducido no válido");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
