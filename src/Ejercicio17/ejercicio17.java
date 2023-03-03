package Ejercicio17;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		/*	Declaramos las variables	*/
		double radio, area, perimetro;
		
		/*	Leemos las entradas	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el radio del circulo: ");
		
		/*	Asignamos los valores según los cálculos correspondientes	*/
		radio = sc.nextDouble();
		area = Math.PI * Math.pow(radio,2);
		perimetro = 2 * Math.PI * radio;
		
		/*	Imprimimos la respuesta	*/
		System.out.println("El area del circulo de radio "+ radio + " es: " + (double) Math.round(area*100)/100 );
		System.out.println("El perimetro del circulo de radio "+ radio + " es: " + (double) Math.round(perimetro*100)/100);

		
		/*	Cerramos el scanner	*/
		sc.close();
	}
}
