package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Variable para el número
		int num, numreves = 0;
		
		//Variables para número del revés
		int cont1=10;
		
		//Variable para saber si es capicúa
		boolean capicua = false;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número
		System.out.println("Introduzca un número de 0-9999");
		
		//Leo del teclado
		num = sc.nextInt();
		
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
