package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Variable para guardar el numero y los numeros primos
		int num, primos=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por un numero
		System.out.println("Introduzca un número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Calculo el numero de primos entre 1 y el numero en cuestion
		for(int i=2; i<num; i++) {
			primos++;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					primos--;
					break;
				}
			}
		}
		
		//Muestro la cantidad de numeros primos
		System.out.println("Entre 1 y " + num + " hay " + primos + " números primos");
		
		//Cierro el Scanner
		sc.close();

	}

}
