package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		//Variable para guardar el numero
		int num = 0;
		
		//Variable para guardar las líneas
		String espacio = "", asterisco = "";
		
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
		
		//Muestro la pirámide
		for(int i=1; i<=num; i++) {
			for(int j=num; j>i; j--) {
				espacio=espacio+" ";
			}
			asterisco=asterisco+"* ";
			System.out.println(espacio+asterisco);
			espacio="";
		}
		
		//Cierro el scanner
		sc.close();
		

	}

}
