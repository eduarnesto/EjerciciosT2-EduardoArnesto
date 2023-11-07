package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Variable para guardar el numero
		int num;
		
		//Variable para guardar las líneas
		String linea="";
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por un numero
		System.out.println("Introduzca un número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Muestro la pirámide de números
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				linea+=i;
			}
			System.out.println(linea);
			linea="";
		}
		
		//Cierro el scanner
		sc.close();
		

	}

}
