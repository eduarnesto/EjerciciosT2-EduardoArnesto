package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio04 {
	/* Introduzco: 11| Espero: El número es: Once| Resultado: El número es: Once
	 * Introduzco: 16| Espero: El número es: Dieciseis| Resultado: El número es: Dieciseis
	 * Introduzco: 1| Espero: El número es: Uno| Resultado: El número es: Uno
	 * Introduzco: 30| Espero: El número es: Treinta| Resultado:El número es: Treinta
	 * Introduzco: 61| Espero: El número es: Sesenta y uno| Resultado: El número es: Sesenta y uno
	 */
	public static void main(String[] args) {
		//Variable para el número
		int num;
		
		//Variable para el resultado
		String res;
		
		//Variables para el primer dígito y para el segundo
		int dig1, dig2;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número
		System.out.println("Introduzca un número de 0-99");
		
		//Leo el número del teclado del teclado
		num = sc.nextInt();
		
		//Compruebo que el número esté dentro del rango
		if(num>=1 && num<=99) {
			dig1=num/10;
			dig2=num%10;
			if(num>10&&num<=15) {
				res=switch(num) {
				case 11->"Once";
				case 12->"Doce";
				case 13->"Trece";
				case 14->"Catorce";
				case 15->"Quince";
				default -> "";
				};
			} else {
				if(num<10) {
					res=switch(num) {
					case 1->"Uno";
					case 2->"Dos";
					case 3->"Tres";
					case 4->"Cuatro";
					case 5->"Cinco";
					case 6->"Seis";
					case 7-> "Siete";
					case 8->"Ocho";
					case 9->"Nueve";
					default -> "";
					};
				} else {
					if(num%10==0) {
						res=switch(dig1) {
						case 1->"Diez";
						case 2->"Veinte";
						case 3->"Treinta";
						case 4->"Cuarenta";
						case 5->"Cincuenta";
						case 6->"Sesenta";
						case 7->"Setenta";
						case 8->"Ochenta";
						case 9->"Noventa";
						default -> "";
						};
					} else {
						res=switch(dig1) {
						case 1->"Dieci";
						case 2->"Veinti";
						case 3->"Treinta y ";
						case 4->"Cuarenta y ";
						case 5->"Cincuenta y ";
						case 6->"Sesenta y ";
						case 7->"Setenta y ";
						case 8->"Ochenta y ";
						case 9->"Noventa y ";
						default -> "";
						};
						res=switch(dig2) {
						case 1->res + "uno";
						case 2->res + "dos";
						case 3->res + "tres";
						case 4->res + "cuatro";
						case 5->res + "cinco";
						case 6->res + "seis";
						case 7->res + "siete";
						case 8->res + "ocho";
						case 9->res + "nueve";
						default -> "";
						};
					}
				}
			}
				System.out.println("El número es: " + res);
				
			} else {
				System.out.println("Valor introducido no válido");
			}
		
		//Cierro el Scanner
		sc.close();
		}
	}
