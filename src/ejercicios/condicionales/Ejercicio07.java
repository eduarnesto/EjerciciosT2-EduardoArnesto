package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio07 {
	/* Introduzco: 2, 2, 2| Espero: 2:2:3| Resultado: 2:2:3
	 * Introduzco: 2, 2, 59| Espero: 2:3:0| Resultado: 2:3:0
	 * Introduzco: 2, 59, 59| Espero: 3:0:0| Resultado: 3:0:0
	 * Introduzco: 23, 59, 59| Espero: 0:0:0| Resultado: 0:0:0
	 * Introduzco: 23, 23, 61| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: 23, 23, -61| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: 23, 230, 2| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: 23, -61, 2| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: 23, 230, 2| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: 23, -61, 2| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: 25, 23, 1| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: -25, 23, 1| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 */
	public static void main(String[] args) {
		//Variable para los horas, minutos y segundos
		int horas, min, segundos;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por las horas
		System.out.println("Introduzca las horas");
		
		//Leo del teclado
		horas=sc.nextInt();
		
		//Pregunto por las minutos
		System.out.println("Introduzca las minutos");
		
		//Leo del teclado
		min=sc.nextInt();
		
		//Pregunto por las segundos
		System.out.println("Introduzca las segundos");
		
		//Leo del teclado
		segundos=sc.nextInt();
		
		//Sumo 1 a los segundos
		segundos++;
		
		//Compruebo que no se hayan introducido números negativos
		if(horas<0 || min<0 || segundos<0){
			System.out.println("Valores introducidos no válidos");
		} else {
			if(segundos>=60) {
				min=min+segundos/60;
				segundos=segundos%60;
				if(min>=60) {
					horas=horas+min/60;
					min=min%60;
					if(horas>=24) {
						horas=0;
					}
				}
			}
			System.out.println(horas + ":" + min + ":" + segundos);
		}
		//Cierro el Scanner
		sc.close();
	}

}
