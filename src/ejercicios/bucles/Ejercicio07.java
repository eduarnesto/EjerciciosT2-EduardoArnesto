package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
	/*
	 * 
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
		} while(num<0);
		
		//Muestro la pirámide de números
		for(int i=1; i<=num; i++) {
			int j;
			for(j=1; j<=i; j++) {
				linea+=j;
			}
			for(int k=j-2; k>=1;k--) {
				linea+=k;
			}
			System.out.println(linea);
			linea="";
		}
		
		//Cierro el scanner
		sc.close();
		

	}

}
