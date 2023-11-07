package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Variable para los dos número y el minimo comun multiplo
		int num1, num2, mcm=0;
		
		//Variable auxiliar para que el numero 1 sea el mayor numero
		int aux;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el primer número
		System.out.println("Introduzca el primer número");
		
		//Leo del teclado
		num1=sc.nextInt();
		
		//Pregunto por el segundo número
		System.out.println("Introduzca el segundo número");
		
		//Leo del teclado
		num2=sc.nextInt();
		
		//Hago que el num1 sea el mayor número
		if(num2>num1) {
			aux=num1;
			num1=num2;
			num2=aux;
		}
		
		//Calculo el minimo comun divisor
		for(int i=num1; i<=num1*num2; i++) {
			System.out.println(i);
			if(i%num1==0) {
				if(i%num2==0) {
					mcm=i;
					break;
				}
			}
		}
		
		//Muestro el mcd
		if(mcm==0) {
			System.out.println("Estos dos número no tienen máximo común divisor");
		} else {
			System.out.println("El mínimo común múltiplo es " + mcm);
		}
		
		//Cierro el Scanner
		sc.close();

	}

}

