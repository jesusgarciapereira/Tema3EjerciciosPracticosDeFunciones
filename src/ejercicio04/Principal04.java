package ejercicio04;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//1. Sumatorio
//2. Potencia
//3. Serie de Fibonacci
//0. Salir
//
//Seleccione una opción
//
//ENTRADA: Quiero la Serie de Fibonacci | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 1.5 | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: -1 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 4 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 1 dos | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 1 0 | RESULTADO ESPERADO: Seleccione un valor para n (mayor que 0)
//ENTRADA: 1 4 | RESULTADO ESPERADO: 10
//ENTRADA: 2 0 1 | RESULTADO ESPERADO: 0
//ENTRADA: 2 -2.1 2  | RESULTADO ESPERADO: 4.41
//ENTRADA: 3 0 | RESULTADO ESPERADO: Seleccione una posición de la serie de Fibonacci (a partir del 1)
//ENTRADA: 3 6 | RESULTADO ESPERADO: 8
//ENTRADA: 0 | RESULTADO ESPERADO: Saliendo del programa

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

	// Función pideNumero() - DE CREACIÓN PROPIA
		public static int pideNumero() {
			// Variable del número que pediremos al usuario
			int numero = 0;

			// Este bloque de instrucciones se ejecutará, al menos, una vez
			do {
				try {
					// Pedimos al usuario un valor para n
					System.out.println("Seleccione un valor para n (mayor que 0)");
					// Lo leemos y se lo asignamos a la variable numero
					numero = sc.nextInt();
					// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
				} catch (InputMismatchException e) {
					System.out.println("El dato introducido no es del tipo correcto");
					// Siempre limpiaremos el buffer
				} finally {
					sc.nextLine();
				}
				// Si el valor de la variable es menor o igual que 0, repetiremos el bloque de instrucciones del do
			} while (numero <= 0);

			// La función devolverá el valor asignado a numero
			return numero;

		}
	
	// Función pideBase() - DE CREACIÓN PROPIA
	public static double pideBase() {
		// Variable de la base que pediremos al usuario
		double base = -1;

		// Variable booleana para determinar si el dato es del tipo correcto
		boolean numeroCorrecto = false;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario un valor para la base
				System.out.println("Seleccione un valor para la base");
				// Lo leemos y se lo asignamos a la variable base
				base = sc.nextDouble();
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

		// La función devolverá el valor asignado a la base
		return base;

	}
	
	// Función pideExponente() - DE CREACIÓN PROPIA
		public static int pideExponente() {
			// Variable del exponente que pediremos al usuario
			int exponente = -1;

			// Variable booleana para determinar si el dato es del tipo correcto
			boolean numeroCorrecto = false;

			// Este bloque de instrucciones se ejecutará, al menos, una vez
			do {
				try {
					// Pedimos al usuario un valor para el exponente
					System.out.println("Seleccione un valor para el exponente");
					// Lo leemos y se lo asignamos a la variable exponente
					exponente = sc.nextInt();
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

			// La función devolverá el valor asignado al exponente
			return exponente;

		}

		// Función pidePosicion() - DE CREACIÓN PROPIA
				public static int pidePosicion() {
					// Variable del número que pediremos al usuario
					int posicion = 0;

					// Este bloque de instrucciones se ejecutará, al menos, una vez
					do {
						try {
							// Pedimos al usuario un valor para la posición
							System.out.println("Seleccione una posición de la serie de Fibonacci (a partir del 1)");
							// Lo leemos y se lo asignamos a la variable posicion
							posicion = sc.nextInt();
							// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
						} catch (InputMismatchException e) {
							System.out.println("El dato introducido no es del tipo correcto");
							// Siempre limpiaremos el buffer
						} finally {
							sc.nextLine();
						}
						// Si el valor de la variable es menor o igual que 0, repetiremos el bloque de instrucciones del do
					} while (posicion <= 0);

					// La función devolverá el valor asignado a posicion
					return posicion;

				}

	// Función main()
	public static void main(String[] args) {
		// Variable de la opción elegida por el usuario
		int opcion;
		// Variables de los números que le pediremos al usuario
		int numero;
		double base;
		int exponente;
		int posicion;
		// Variable del resultado que mostraremos
		double resultado;

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
				System.out.println("Sumatorio (entre 1 y n):");
				
				// Asignamos al número entero el valor devuelto por la función pideNumero()
				numero = Principal04.pideNumero();
				
				// Asignamos al resultado el valor devuelto por la función sumatorio(numero)
				System.out.println("Resultado");
				yield FuncionesRecursivas04.sumatorio(numero);
			}

			case 2 -> {
				// Mostramos la opción elegida
				System.out.println("Potencia:");
				
				// Asignamos a la base el valor devuelto por la función pideBase()
				base = Principal04.pideBase();
				
				// Asignamos al exponente el valor devuelto por la función pideExponente()
				System.out.println("Expponente:");
				exponente = Principal04.pideExponente();
				
				// Asignamos al resultado el valor devuelto por la función potencia(base, exponente)
				System.out.println("Resultado");
				yield FuncionesRecursivas04.potencia(base, exponente);
			}
			case 3 -> {
				// Mostramos la opción elegida
				System.out.println("Fibonacci:");
				
				// Asignamos a la posición el valor devuelto por la función pidePosicion()
				posicion = Principal04.pidePosicion();
				
				// Asignamos al resultado el valor devuelto por la función serieFibonacci(posicion)
				System.out.println("Resultado");
				yield FuncionesRecursivas04.serieFibonacci(posicion);
			}
			
			// Caso default obligatorio con un valor que nunca se mostrará
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
