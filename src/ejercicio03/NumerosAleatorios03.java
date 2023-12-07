package ejercicio03;

import java.util.Random;

public class NumerosAleatorios03 {

	// Funcion numerosAleatorios(int cantNumeros)
	public static void numerosAleatorios(int cantNumeros) {

		// Variable numAleatorio
		double numAleatorio;

		// Creamos un objeto de tipo Random
		Random r = new Random();

		// Mostramos el valor del parámetro de la función
		System.out.print(cantNumeros + " Número(s) aleatorio(s) entre 0 y 1: ");
		// Bucle for que se repetira tantas veces como el valor del parámetro
		for (int i = 1; i <= cantNumeros; i++) {
			// Le asignamos a la variable un número aleatorio entre 0 y 1
			numAleatorio = r.nextDouble(0, 1);
			// Y lo mostramos
			System.out.print(numAleatorio + " ");
		}
	}

	// Funcion numerosAleatorios(int cantNumeros, int valorMaximo)
	public static void numerosAleatorios(int cantNumeros, int valorMaximo) {

		// Variable numAleatorio
		int numAleatorio;
		// Creamos un objeto de tipo Random
		Random r = new Random();

		// Mostramos los valores de los parámetros de la función
		System.out.print(cantNumeros + " Número(s) aleatorio(s) entre 1 y " + valorMaximo + ": ");
		// Bucle for que se repetira tantas veces como el valor del primer parámetro
		for (int i = 1; i <= cantNumeros; i++) {
			// Le asignamos a la variable un número aleatorio entre 1 y el valor del segundo
			// parámetro
			numAleatorio = r.nextInt(1, valorMaximo + 1);
			// Y lo mostramos
			System.out.print(numAleatorio + " ");
		}
	}

	// Funcion numerosAleatorios(int cantNumeros, int valorMinimo, int valorMaximo)
	public static void numerosAleatorios(int cantNumeros, int valorMinimo, int valorMaximo) {

		// Variable numAleatorio
		int numAleatorio;
		// Creamos un objeto de tipo Random
		Random r = new Random();

		// Mostramos los valores de los parámetros de la función
		System.out.print(cantNumeros + " Número(s) aleatorio(s) entre " + valorMinimo + " y " + valorMaximo + ": ");
		// Bucle for que se repetira tantas veces como el valor del primer parámetro
		for (int i = 1; i <= cantNumeros; i++) {
			// Le asignamos a la variable un número aleatorio entre los valores del segundo
			// y del tercer parámetro
			numAleatorio = r.nextInt(valorMinimo, valorMaximo + 1);
			// Y lo mostramos
			System.out.print(numAleatorio + " ");
		}
	}
}
