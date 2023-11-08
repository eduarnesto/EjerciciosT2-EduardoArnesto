package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio05 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		//Variable para número y valor absoluto
		int num, absoluto;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número
		System.out.println("Introduzca un número");
		
		//Leo el número del teclado
		num = sc.nextInt();
		
		//Calculo el absoluto del número
		absoluto= num > 0 ? num : -num;
		
		//Muestro el absoluto
		System.out.println("El absoluto de " + num + " es " + absoluto);
		
		//Cierro el Scanner
		sc.close();
	}

}
