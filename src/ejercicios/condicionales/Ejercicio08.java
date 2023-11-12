package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio08 {
	/* Introduzco: 4, 4| Espero: El precio es 10| Resultado: El precio es 10
	 * Introduzco: 900, 8| Espero: El precio es 1575| Resultado: El precio es 1575
	 */
	public static void main(String args[]) {
		//Variable para el precio, para el descuento y para el precio por kilómetro
		double precio, descuento = 0.7, kilometraje = 2.5;
		
		//Variable para la distancia a recorrer y días de estancia
		int distancia, dias;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por la distancia
		System.out.println("Introduzca la distancia recorrida");
		
		//Leo del teclado
		distancia=sc.nextInt();
		
		//Pregunto por los días
		System.out.println("Introduzca los días de estancia");
		
		//Leo del teclado
		dias=sc.nextInt();
		
		//Calculo el precio
		precio=distancia*kilometraje;
		
		//Compruebo si se aplica descuento
		if(distancia<0||dias<0) {
			System.out.println("Valores introducidos no válidos");
		} else {
			if(distancia>800&&dias>7) {
				precio*=descuento;
			}
			//Muestro el precio
			System.out.println("El precio es " + precio);
		}
		
		//Cierro el Scanner
		sc.close();
    }
} 
