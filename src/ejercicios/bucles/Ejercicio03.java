package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Variable para guardar el numero
		int num;
		
		//Variable para guardar las líneas
		String espacio = "", asterisco = "";
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por un numero
		System.out.println("Introduzca un número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Muestro la pirámide
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				espacio=espacio+" ";
			}
			asterisco=asterisco+"* ";
			System.out.println(espacio+asterisco);
			espacio="";
		}
		
		//Cierro el scanner
		sc.close();
		

	}

}
