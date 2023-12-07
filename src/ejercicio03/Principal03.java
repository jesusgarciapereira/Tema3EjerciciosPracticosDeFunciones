package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal03 {

	// Activamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función pideCantNumeros() - DE CREACIÓN PROPIA
	public static int pideCantNumeros() {
		// Variable de la cantidad de números que pediremos al usuario
		int cantNumeros = 0;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario la cantidad de números que desea generar
				System.out.println("Escriba la cantidad de números que desea generar");
				// Lo leemos y se lo asignamos a la variable
				cantNumeros = sc.nextInt();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor que 1, repetiremos el bloque de
			// instrucciones del do
		} while (cantNumeros < 1);

		// La función devolverá el valor asignado a cantNumeros
		return cantNumeros;
	}

	// Función pideValorMaximo() - DE CREACIÓN PROPIA
	public static int pideValorMaximo() {
		// Variable del valor máximo de los números generados que pediremos al usuario
		int valorMaximo = 1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario el valor máximo que tomará el número aleatorio
				System.out.println("Escriba el valor máximo que tomará el número aleatorio");
				// Lo leemos y se lo asignamos a la variable
				valorMaximo = sc.nextInt();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor o igual que 1, repetiremos el bloque de
			// instrucciones del do
		} while (valorMaximo <= 1);

		// La función devolverá el valor asignado a valorMaximo
		return valorMaximo;
	}

	// Función pideValorMinimo() - DE CREACIÓN PROPIA
	public static int pideValorMinimo() {
		// Variable del valor mínimo de los números generados que pediremos al usuario
		int valorMinimo = 1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario el valor mínimo que tomará el número aleatorio
				System.out.println("Escriba el valor mínimo que tomará el número aleatorio");
				// Lo leemos y se lo asignamos a la variable
				valorMinimo = sc.nextInt();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor o igual que 1, repetiremos el bloque de
			// instrucciones del do
		} while (valorMinimo <= 1);

		// La función devolverá el valor asignado a valorMinimo
		return valorMinimo;
	}

	public static void main(String[] args) {
		// Variables introducidas por el usuario
		int cantNumeros, valorMaximo, valorMinimo;

		// Asignamos a cantNumeros el valor devuelto por la función pideCantNumeros()
		cantNumeros = Principal03.pideCantNumeros();
		// Asignamos a valorMaximo el valor devuelto por la función pideValorMaximo()
		valorMaximo = Principal03.pideValorMaximo();
		// Asignamos a valorMinimo el valor devuelto por la función pideValorMinimo()
		valorMinimo = Principal03.pideValorMinimo();

		// Llamamos a todas las funciones de la clase NumerosAleatorios03
		NumerosAleatorios03.numerosAleatorios(cantNumeros);
		System.out.println(); // Salto de línea
		NumerosAleatorios03.numerosAleatorios(cantNumeros, valorMaximo);
		System.out.println(); // Salto de línea
		NumerosAleatorios03.numerosAleatorios(cantNumeros, valorMinimo, valorMaximo);
		System.out.println(); // Salto de línea

		// Cerramos el Scanner
		sc.close();

	}

}
