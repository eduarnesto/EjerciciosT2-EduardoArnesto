package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	/* Introduzco: 1, 1, 1, 1| Espero: 1, 1, 2| Resultado: 1, 1, 2
	 * Introduzco: 10, 10, 10, 60| Espero: 10, 11, 10| Resultado: 10, 11, 10
	 * Introduzco: 23, 59, 59, 1| Espero: 0, 0, 0| Resultado: 0, 0, 0
	 */
	public static void main(String[] args) {
		//Variable para las horas, minutos, segundos e incremento
		int horas = -1, min = -1, seg = -1, incremento = -1;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				//Pregunto por las horas
				System.out.println("Introduzca las horas");
				
				//Leo del teclado
				horas=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while(horas<0 || horas>24); //Fin do while
				
		do {
			try {
				//Pregunto por las minutos
				System.out.println("Introduzca las minutos");
				
				//Leo del teclado
				min=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while(min<0 || min>60); //Fin do while
				
		do {
			try {
				//Pregunto por las segundos
				System.out.println("Introduzca las segundos");
				
				//Leo del teclado
				seg=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while(seg<0 || seg>60); //Fin do while
				
		do {
			try {
				//Pregunto por el incremento
				System.out.println("Introduzca el incremento");
				
				//Leo del teclado
				incremento=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introudcido no válido");
				sc.next();
			}
		} while(incremento<0); //Fin do while
		
		//Sumo el incremento a los segundos
		seg+=incremento;
		
		//Calculo la hora 
		while (seg>=60) {
			min++;
			seg-=60;
		}
		while (min>=60) {
			horas++;
			min-=60;
		}
		while (horas>=24) {
			horas-=24;
		}
		
		//Muestro la hora
		System.out.println(horas + ":" + min + ":" + seg);
		
		//Cierro el Scanner
		sc.close();
		
	}

}
