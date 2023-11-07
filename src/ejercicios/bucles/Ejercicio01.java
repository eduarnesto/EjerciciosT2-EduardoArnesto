package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Variable para las horas, minutos, segundos e incremento
		int horas, min, seg, incremento;
		
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
		seg=sc.nextInt();
		
		//Pregunto por el incremento
		System.out.println("Introduzca el incremento");
		
		//Leo del teclado
		incremento=sc.nextInt();
		
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
