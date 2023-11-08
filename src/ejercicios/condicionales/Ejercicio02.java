package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * 
	 */

		public static void main(String[] args) {
			//Variable para numero de DNI
			int num;
			
			//Variable para la letra del DNI
			char letra;
			
			//Scanner para leer del taclado
			Scanner sc = new Scanner(System.in);
			
			//Pregunto por el número del DNI
			System.out.println("Introduzca el número del DNI");
			
			//Leo del teclado
			num = sc.nextInt();
			
			//Compruebo la letra del DNI
			if(num>99999999||num<0) {
				System.out.println("Valor introducido no válido");
			} else {
				letra = switch (num%23) {
				case 0-> 'T';
				case 1-> 'R';
				case 2-> 'W';
				case 3-> 'A';
				case 4-> 'G';
				case 5-> 'M';
				case 6-> 'Y';
				case 7-> 'F';
				case 8-> 'P';
				case 9-> 'D';
				case 10-> 'X';
				case 11-> 'B';
				case 12-> 'N';
				case 13-> 'J';
				case 14-> 'Z';
				case 15-> 'S';
				case 16-> 'Q';
				case 17-> 'V';
				case 18-> 'H';
				case 19-> 'L';
				case 20-> 'C';
				case 21-> 'K';
				case 22-> 'E';
				default -> '1';
				};
			
				//Muestro la letra del DNI
				System.out.println("La letra del DNI es: " + letra);
			}
			
			//Cierro el Scanner
			sc.close();
		}

	}
