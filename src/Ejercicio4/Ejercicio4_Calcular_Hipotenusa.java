package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4_Calcular_Hipotenusa {

	public static void main(String[] args) {
		// Introduccion de Variables
		float cateto1 = 0;
		float cateto2 = 0;
		float salida = 0;
		
		cateto1 = Validacion1();
		cateto2 = Validacion2();
		
		salida = Hipotenusa(cateto1,cateto2);
		
		System.out.println("La hipotenusa es de: "+salida);
		
	}
	public static float Validacion1(){
		// Variables
		Scanner teclado = new Scanner (System.in);
		float cateto1 = 0;
		String aux = "";
		boolean esCorrecto = false;
		
		do{
			System.out.println("Introduzca el primer cateto:");
		
			try {
				aux = teclado.nextLine();
				cateto1 = Float.parseFloat(aux);
				esCorrecto = true;
				}
			catch (Exception e){
				System.out.println("ERROR: No ha introducido un valor correcto");
				esCorrecto = false;
			}
		}
		while (esCorrecto== false);
		
		return cateto1;
	}
	
	public static float Validacion2(){
		// Variables
		Scanner teclado = new Scanner (System.in);
		float cateto2 = 0;
		String aux = "";
		boolean esCorrecto = false;
		
		do{
			System.out.println("Introduzca el primer cateto:");
		
			try {
				aux = teclado.nextLine();
				cateto2 = Float.parseFloat(aux);
				esCorrecto = true;
				}
			catch (Exception e){
				System.out.println("ERROR: No ha introducido un valor correcto");
				esCorrecto = false;
			}
		}
		while (esCorrecto== false);
		
		return cateto2;
	}
	
	public static float Hipotenusa(float cateto1, float cateto2){
		float hipo = 0;
		
		hipo = (float)Math.sqrt(Math.pow(cateto1, 2)*(Math.pow(cateto2, 2)));
		
		return hipo;
	}
}
