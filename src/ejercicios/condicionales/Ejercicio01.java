package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Variable para el número
		int num;
		
		//Variables para número del revés
		int numreves = 0;
		
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
			numreves=num%10;
			
			if(num>=10) {
				numreves=numreves*10;
				numreves+=num%100/10;
				
				if(num>=100) {
					numreves=numreves*10;
					numreves+=num%1000/100;
					
					if(num>=1000) {
						numreves=numreves*10;
						numreves+=num/1000;
					}
				}
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
