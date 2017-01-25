package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2_AreayPerimetroCirculo {

	public static void main(String[] args) {
		// Introduccion de Variables
		float radio = 0;
		float area = 0;
		float perimetro = 0;

		
		radio=Validacion();
		
		area = AreaCirculo(radio);
		
		perimetro = PerimetroCirculo(radio);
		
		System.out.println("El area es de: "+area);
		System.out.println("El perimetro es de: "+perimetro);

	}
	public static float Validacion(){
		Scanner teclado = new Scanner (System.in);
		float numero = 0;
		String aux;
		boolean esCorrecto = false;
		
		do{
			System.out.println("Introduzca el tamaño del radio: ");
			try{
				aux = teclado.nextLine();
				numero = Float.parseFloat(aux);
				esCorrecto = true;
			}
			catch(Exception e){
				System.out.println("ERROR:No ha introducido un valor correcto");
				esCorrecto = false;
			}
		}
		while(esCorrecto == false);
		
		return numero;
	}
	
	public static float AreaCirculo(float radio){
		float area = 0;

		area  = (float) (Math.PI * (radio*radio));
		
		return area;
	}
	public static float PerimetroCirculo(float radio){
		float perimetro = 0;

		perimetro  = (float) (2 * Math.PI * radio);
		
		return perimetro;
	}
}
