package ejercicio05;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//1. Triángulo
//2. Cuadrado
//3. Hexágono
//0. Salir
//
//Seleccione una opción
//
//ENTRADA: Dibujemos | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 3.7 | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: -1 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 4 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 1 triángulo | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 1 0 | RESULTADO ESPERADO: Introduzca el lado de la figura
//ENTRADA: 1 4 T | RESULTADO ESPERADO:    T 
//										 T T 
//										T T T 
//									   T T T T 
//ENTRADA: 2 0 | RESULTADO ESPERADO: Introduzca el lado de la figura
//ENTRADA: 2 5 R  | RESULTADO ESPERADO: R R R R R 
//										R R R R R 
//										R R R R R 
//										R R R R R 
//										R R R R R
//ENTRADA: 3 0 | RESULTADO ESPERADO: Introduzca el lado de la figura
//ENTRADA: 3 6 < | RESULTADO ESPERADO:      <<<<<<
//										   <<<<<<<<
//										  <<<<<<<<<<
//										 <<<<<<<<<<<<
//										<<<<<<<<<<<<<<
//									   <<<<<<<<<<<<<<<<
//										<<<<<<<<<<<<<<
//										 <<<<<<<<<<<<
//										  <<<<<<<<<<
//										   <<<<<<<<
//											<<<<<<
//ENTRADA: 0 | RESULTADO ESPERADO: Saliendo del programa

public class Principal05 {

	// Activamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función menu() - DE CREACIÓN PROPIA
	public static int menu() {

		// Variable de la opción elegida
		int opcionElegida;

		// Mostramos el menú con las opciones
		System.out.println("1. Triángulo");
		System.out.println("2. Cuadrado");
		System.out.println("3. Hexágono");
		System.out.println("0. Salir");
		System.out.println(); // Salto de línea

		// Asignamos a la variable el valor devuelto por la funcion pideOpcion()
		opcionElegida = Principal05.pideOpcion();

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

	// Función pideLado() - DE CREACIÓN PROPIA
	public static int pideLado() {
		// Variable del lado que pediremos al usuario
		int lado = 0;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario el lado de la figura
				System.out.println("Introduzca el lado de la figura");
				// Lo leemos y se lo asignamos a la variable
				lado = sc.nextInt();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor que 1, repetiremos el bloque de
			// instrucciones del do
		} while (lado < 1);

		// La función devolverá el valor asignado al lado
		return lado;
	}

	// Función pideCaracter() - DE CREACIÓN PROPIA
	public static String pideCaracter() {
		// Variable del caracter que pediremos al usuario
		String caracter = "";

		// Pedimos al usuario el caracter que dibujará la figura
		System.out.println("Introduzca el caracter que dibujará la figura");
		// Lo leemos y se lo asignamos a la variable
		caracter = sc.nextLine();

		// La función devolverá el valor asignado al caracter
		return caracter;
	}

	// Función main
	public static void main(String[] args) {
		// Variable de la opción elegida por el usuario
		int opcion;
		// Variables que le pediremos al usuario
		int lado;
		String caracter;

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Asignamos a la opción el valor devuelto por la función menu()
		opcion = Principal05.menu();

		// Mientras la opcion sea diferente de 0, ejecutaremos estas instrucciones
		while (opcion != 0) {

			// Asignamos al lado el valor devuelto por la funcion pideLado()
			lado = Principal05.pideLado();
			// Asignamos al caracter el valor devuelto por la funcion pideCaracter()
			caracter = Principal05.pideCaracter();

			// Creamos un objeto de tipo Figuras05 con los valores solicitados al
			// usuario como parámetros
			Figuras05 figura = new Figuras05(lado, caracter);

			// Llamamos a una de estas funciones, según cada caso del valor de la opción
			switch (opcion) {
			case 1 -> figura.triangulo();
			case 2 -> figura.cuadrado();
			case 3 -> figura.hexagono();
			}

			// Salto de línea
			System.out.println();

			// Asignamos a la opción un nuevo valor devuelto por la función menu()
			opcion = Principal05.menu();
		}

		// Al salir del bucle, mostraremos este mensaje
		System.out.println("Saliendo del programa");

		// Cerramos el Scanner
		sc.close();
	}

}
