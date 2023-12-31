package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
	/* Introduzco: 3| Espero: 
	 * 1
	 * 22
	 * 333
	 * Resultado:
	 * 1
	 * 22
	 * 333 
	 * Introduzco: -5 | Espero: Pregunta el número otra vez | Resultado: Pregunta el número otra vez
	 */
	public static void main(String[] args) {
		//Variable para guardar el numero
		int num = 0;
		
		//Variable para guardar las líneas
		String linea="";
		
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
		} while (num<0);
		
		//Muestro la pirámide de números
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				linea+=i;
			}
			System.out.println(linea);
			linea="";
		}
		
		//Cierro el scanner
		sc.close();
		

	}

}
