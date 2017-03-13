package Ejercicio1arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mo, desde, hasta;
		Vector vector;
		Scanner teclado = new Scanner(System.in);
		System.out.println("ARRAY MAGICO DE NUMEROS");
		System.out.println();
		System.out.println();
		System.out.println("Introduce el tamaño de tu array");
		mo=teclado.nextInt();
		
		System.out.println("Introduce desde que numero coge un valor aleatorio");
		desde=teclado.nextInt();

		System.out.println("Introduce hasta que numero coge un valor aleatorio");
		hasta=teclado.nextInt();
		vector=new Vector(mo,desde,hasta);
		System.out.println("Valores generados en el Array:");
		vector.imprimeVector();
		
		
	}

}
