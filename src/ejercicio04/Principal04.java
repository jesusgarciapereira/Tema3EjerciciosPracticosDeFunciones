package ejercicio04;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal04 {

	// Activamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función menu() - DE CREACIÓN PROPIA
	public static int menu() {

		// Variable de la opción elegida
		int opcionElegida;

		// Mostramos el menú con las opciones
		System.out.println("1. Sumatorio");
		System.out.println("2. Potencia");
		System.out.println("3. Serie de Fibonacci");
		System.out.println("0. Salir");
		System.out.println(); // Salto de línea

		// Asignamos a la variable el valor devuelto por la funcion pideOpcion()
		opcionElegida = Principal04.pideOpcion();

		// La función devolverá el valor asignado a opcionElegida
		return opcionElegida;
	}

	// Función pideOpcion() - DE CREACIÓN PROPIA
	public static int pideOpcion() {

		// Variable de la opción que pediremos al usuario
		int opcion = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario un número entero
				System.out.println("Seleccione una opción");
				// Lo leemos y se lo asignamos a la variable
				opcion = sc.nextInt();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable se sale de estos márgenes, repetiremos el bloque
			// de instrucciones del do
		} while (opcion < 0 || opcion > 3);

		// La función devolverá el valor asignado a opcion
		return opcion;
	}

	// Función pideNumeroInt() - DE CREACIÓN PROPIA
	public static int pideNumeroInt() {
		// Variable del número entero que pediremos al usuario
		int numeroInt = -1;

		// Variable booleana para determinar si el dato es del tipo correcto
		boolean numeroCorrecto = false;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario un número real
				System.out.println("Seleccione un número");
				// Lo leemos y se lo asignamos a la variable numero
				numeroInt = sc.nextInt();
				// Si es del tipo correcto, le asignamos true a numeroCorrecto
				numeroCorrecto = true;
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable no es del tipo correcto, repetiremos el bloque
			// de instrucciones del do
		} while (!numeroCorrecto);

		// La función devolverá el valor asignado a numeroInt
		return numeroInt;

	}

	// Función pideNumeroDouble() - DE CREACIÓN PROPIA
	public static int pideNumeroDouble() {
		// Variable del número entero que pediremos al usuario
		int numeroDouble = -1;

		// Variable booleana para determinar si el dato es del tipo correcto
		boolean numeroCorrecto = false;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario un número real
				System.out.println("Seleccione un número");
				// Lo leemos y se lo asignamos a la variable numero
				numeroDouble = sc.nextInt();
				// Si es del tipo correcto, le asignamos true a numeroCorrecto
				numeroCorrecto = true;
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable no es del tipo correcto, repetiremos el bloque
			// de instrucciones del do
		} while (!numeroCorrecto);

		// La función devolverá el valor asignado a numeroInt
		return numeroDouble;

	}

	// Función main()
	public static void main(String[] args) {
		// Variable de la opción elegida por el usuario
		int opcion;
		// Variables de los números que le pediremos al usuario
		int numInt;
		double numDouble;
		// Variable del resultado que mostraremos
		double resultado = 0;

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Asignamos a la opción el valor devuelto por la función menu()
		opcion = Principal04.menu();

		// Mientras la opcion sea diferente de 0, ejecutaremos estas instrucciones
		while (opcion != 0) {

			// Asignamos al resultado el valor devuelto por una de estas funciones, según
			// cada caso del valor de la opción
			resultado = switch (opcion) {
			case 1 -> {
				// Mostramos la opción elegida
				System.out.println("Sumatorio:");
				
				// Asignamos al número entero el valor devuelto por la función pideNumeroInt()
				numInt = Principal04.pideNumeroInt();
				
				// Asignamos al resultado el valor devuelto por la función sumatorio(numInt)
				System.out.println("Resultado");
				yield FuncionesRecursivas04.sumatorio(numInt);
			}

			case 2 -> {
				// Mostramos la opción elegida
				System.out.println("Potencia:");
				
				// Asignamos a la base el valor devuelto por la función pideNumeroDouble()
				System.out.println("Base:");
				numDouble = Principal04.pideNumeroDouble();
				
				// Asignamos al exponente el valor devuelto por la función pideNumeroInt()
				System.out.println("Expponente:");
				numInt = Principal04.pideNumeroInt();
				
				// Asignamos al resultado el valor devuelto por la función potencia(numDouble, numInt)
				System.out.println("Resultado");
				yield FuncionesRecursivas04.potencia(numDouble, numInt);
			}
			case 3 -> {
				// Mostramos la opción elegida
				System.out.println("Fibonacci:");
				
				// Asignamos al número entero el valor devuelto por la función pideNumeroInt()
				numInt = Principal04.pideNumeroInt();
				
				// Asignamos al resultado el valor devuelto por la función serieFibonacci(numInt)
				System.out.println("Resultado");
				yield FuncionesRecursivas04.serieFibonacci(numInt);
			}
			
			// Caso default obligatorio
			default -> Math.sqrt(-1);
			};

			// Mostramos el resultado
			System.out.println(resultado);

			// Salto de línea
			System.out.println();

			// Asignamos a la opción un nuevo valor devuelto por la función menu()
			opcion = Principal04.menu();
		}

		// Al salir del bucle, mostraremos este mensaje
		System.out.println("Saliendo del programa");

		// Cerramos el Scanner
		sc.close();

	}

}
