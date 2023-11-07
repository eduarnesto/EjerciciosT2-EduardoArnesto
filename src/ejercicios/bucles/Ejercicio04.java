package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Variable para los dos número y el maximo comun divisor
		int num1, num2, mcd=0;
		
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
		
		//Calculo el maximo comun divisor
		for(int i=2; i<=num1; i++) {
			if(num1%i==0) {
				if(num2%i==0) {
					mcd=i;
				}
			}
		}
		
		//Muestro el mcd
		if(mcd==0) {
			System.out.println("Estos dos número no tienen máximo común divisor");
		} else {
			System.out.println("El máximo común divisor es " + mcd);
		}
		
		//Cierro el Scanner
		sc.close();

	}

}
