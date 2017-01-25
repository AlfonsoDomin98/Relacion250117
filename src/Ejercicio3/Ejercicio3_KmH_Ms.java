package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_KmH_Ms {

	public static void main(String[] args) {
		// Introduccion de Variables
		float Metros = 0;
		float salida = 0;
		
		Metros = Validacion();
		
		salida = KM(Metros);
		
		System.out.println("Son "+salida+" M/s");
		
	}
	public static float Validacion(){
		// Variables
		Scanner teclado = new Scanner (System.in);
		float numero = 0;
		String aux =" ";
		boolean esCorrecto = false;
		
		// Validacion
		
		do{
			System.out.println("Introduzca los Km/h: ");
			try{
				aux = teclado.nextLine();
				numero = Float.parseFloat(aux);
				esCorrecto = true;
			}
			catch (Exception e){
				System.out.println("ERROR: No ha introducido un valor correcto");
				esCorrecto = false;
			}
		}
		while(esCorrecto == false);
		
		return numero;
	}

	public static float KM (float Km){
		float metros = 0;
		
		metros = (Km*1000)/3600;
		
		return metros;
	}

}
