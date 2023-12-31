package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio03 {
	/* Introduzco: 21, 21, 1| Espero: Hay suficiente comida | Resultado: Hay suficiente comida
	 * Introduzco: 20, 20, 2| Espero: Cada animal comerá 1 kg| Resultado: Cada animal comerá 0,5 kg
	 * Introduzco: 20, 0, 20| Espero: No hay animales qe alimentar| Resultado: No hay animales qe alimentar
	 * Introduzco: -1, 2, 3| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: 1, -2, 3| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 * Introduzco: 1, 2, -3| Espero: Valores introducidos no válidos| Resultado: Valores introducidos no válidos
	 */
	public static void main(String[] args) {
		//Variables para cantidad de comida, de animales y kilos de comida que consume al día
		int comida, animales, consumo, consumoTotal;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por la cantidad de comida
		System.out.println("Introduzca la cantidad de comida:");
		
		//Leo del teclado
		comida = sc.nextInt();
		
		//Pregunto por la cantidad de animales
		System.out.println("Introduzca la cantidad de animales:");
		
		//Leo del teclado
		animales = sc.nextInt();
		
		//Pregunto por la consumición por animal
		System.out.println("Introduzca la cantidad de comida que consume cada animal:");
		
		//Leo del teclado
		consumo = sc.nextInt();
		
		//Calculo el consumo total
		consumoTotal = consumo*animales;
		
		//Realizo la distribución de la comida
		if(comida>=0&&consumoTotal>=0&&animales>=0) {
			if(comida>=consumoTotal) {
				System.out.println("Hay suficiente comida");
			} else {
				if(animales>0) {
					consumo=comida/animales;
					System.out.println("Cada animal comerá " + consumo + "kg");
				} else {
					System.out.println("No hay animales para alimentar");
				}
			}
		} else {
			System.out.println("Valores introducidos no válidos");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
