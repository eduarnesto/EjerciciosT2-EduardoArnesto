package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio07 {
	/*
	 * 
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
			
			//Cierro el Scanner
			sc.close();
		}
	}

}
