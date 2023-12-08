package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

//ENTRADA: Introduzco 7 | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 76.5 | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 0 | RESULTADO ESPERADO: Introduzca un número entero (a partir del 1)
//ENTRADA: 7 | RESULTADO ESPERADO: 7 es primo y es capicúa
//ENTRADA: 13 | RESULTADO ESPERADO: 13 es primo y no es capicúa
//ENTRADA: 121 | RESULTADO ESPERADO: 121 no es primo y es capicúa
//ENTRADA: 131 | RESULTADO ESPERADO: 131 es primo y es capicúa
//ENTRADA: 567 | RESULTADO ESPERADO: 567 no es primo y no es capicúa

public class Principal01 {

	// Activamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función pideNumero() - DE CREACIÓN PROPIA
	public static int pideNumero() {
		// Variable del numero que pediremos al usuario
		int numero = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario un número entero
				System.out.println("Introduzca un número entero (a partir del 1)");
				// Lo leemos y se lo asignamos a la variable
				numero = sc.nextInt();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor que 1, repetiremos el bloque de
			// instrucciones del do
		} while (numero < 1);

		// La función devolverá el valor asignado a numero
		return numero;
	}

	// Función main()
	public static void main(String[] args) {
		// Variable del número elegido por el usuario
		int numeroElegido;
		// Variables de los booleanos que mostraremos
		boolean numeroElegidoEsPrimo;
		boolean numeroElegidoEsCapicua;

		// Asignamos al número elegido el valor devuelto por la función pideNumero()
		numeroElegido = Principal01.pideNumero();

		// Creamos un objeto de tipo Numeros01 con el valor solicitado al usuario como
		// parámetro
		Numeros01 numero = new Numeros01(numeroElegido);

		// Asignamos a esta variable el valor devuelto por la funcion esPrimo()
		numeroElegidoEsPrimo = numero.esPrimo();
		// Asignamos a esta variable el valor devuelto por la funcion esCapicua()
		numeroElegidoEsCapicua = numero.esCapicua();

		// Mostramos los resultados
		System.out.println(numeroElegido + " " + (numeroElegidoEsPrimo ? "es primo" : "no es primo") + " y "
				+ (numeroElegidoEsCapicua ? "es capicúa" : "no es capicúa"));

		// Cerramos el Scanner
		sc.close();
	}

}
