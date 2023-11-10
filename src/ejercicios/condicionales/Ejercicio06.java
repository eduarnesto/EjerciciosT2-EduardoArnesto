package ejercicios.condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	/* Introduzco: Valor correcto| Espero: El resultado es correcto| Resultado: El resultado es correcto
	 * Introduzco: Valor incorrecto| Espero: El resultado es erróneo| Resultado: El resultado es erróneo
	 */
	
	public static void main(String[] args) {
		//Variable para la respuesta
		int num1, num2, res;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Creo un número aleatorio
		Random r = new Random();
		num1 = r.nextInt(1,100);
		
		//Creo otro número aleatorio
		num2 = r.nextInt(1,100);
		
		//Muestro los numeros generados
		System.out.println("Suma estos dos números: " + num1 + " + " + num2);
		
		//Leo la respuesta del usuario
		res=sc.nextInt();
		
		//Compruebo el resultado
		if(res==num1+num2) {
			System.out.println("El resultado es correcto");
		} else {
			System.out.println("El resultado es erróneo");
		}
		
		//Cierro el Scanner
		sc.close();

	}

}
