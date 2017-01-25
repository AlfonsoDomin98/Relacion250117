package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1_Grados {

	public static void main(String[] args) {
		// Introduccion de Variables
		Scanner teclado = new Scanner (System.in);
		float grados = 0;
		float salida = 0;
		boolean esCorrecto = false;
		
		// Validacion de los datos
		do{
			System.out.println("Introduzca la cantidad de Grados: ");
			try{
				grados = teclado.nextFloat();
				esCorrecto = true;
			}
			catch(Exception e){
				System.out.println("ERROR: No ha introducido un dato correcto");
				esCorrecto = false;
			}
		}
		while (esCorrecto == false);
		
		salida = Grados(grados);
		
		System.out.println("Son "+salida+ " Fah");
		
	}
	public static float Grados (float conversion){
		float grados = 0;
		
		grados = 32 + ( 9 * conversion / 5);
		
		return grados;
	}
	
}
