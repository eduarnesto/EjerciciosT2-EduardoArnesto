package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Variable para número, numero mayor y contador para fallos y numeros introducidos
		int num, mayor, fallos=0, numeros=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número
		System.out.println("Introduce un número inicial:");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Asigno un valor al mayor
		mayor=num;
		
		//Pregunto por los números
		do {
			System.out.println("Introduce un número:");
			num=sc.nextInt();
			if(num==0) {
				break;
			}
			numeros++;
			if(num>mayor) {
				mayor=num;
			} else {
				fallos++;
				System.out.println("Fallo, es menor.");
			}
		}while(num!=0);
		
		//Muestro el total de números introducidos
		System.out.println("Total de números introducidos: " + numeros);
		
		//Muestro el total de fallos introducidos
		System.out.println("Números fallados: " + fallos);
		
		//Cierro el Scanner
		sc.close();
	}

}
