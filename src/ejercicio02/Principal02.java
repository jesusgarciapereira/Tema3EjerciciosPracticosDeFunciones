package ejercicio02;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//ENTRADA: radio esfera | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: -4 | RESULTADO ESPERADO: Introduzca el radio de la esfera (en centímetros)
//ENTRADA: 0 | RESULTADO ESPERADO: Introduzca el radio de la esfera (en centímetros)
//ENTRADA: 3 | RESULTADO ESPERADO:  Una esfera de radio 3 centímetros
//									Tiene una superficie de 113.1 cm2
//									Tiene una volumen de 113.1 cm3
//ENTRADA: 10 | RESULTADO ESPERADO: Una esfera de radio 10 centímetros
//									Tiene una superficie de 1256.6 cm2
//									Tiene una volumen de 4188.8 cm3
//ENTRADA: 4.5 | RESULTADO ESPERADO: Una esfera de radio 4.5 centímetros
//									 Tiene una superficie de 254.5 cm2
//									 Tiene una volumen de 381.7 cm3

public class Principal02 {

	// Activamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función pideRadio() - DE CREACIÓN PROPIA
	public static double pideRadio() {
		// Variable del radio que pediremos al usuario
		double radio = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario el radio de la esfera
				System.out.println("Introduzca el radio de la esfera (en centímetros)");
				// Lo leemos y se lo asignamos a la variable
				radio = sc.nextDouble();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor o igual que 0, repetiremos el bloque de
			// instrucciones del do
		} while (radio <= 0);

		// La función devolverá el valor asignado a numero
		return radio;
	}

	// Función main()
	public static void main(String[] args) {

		// Variable del radio introducido por el usuario
		double radioIntroducido;
		// Variables que mostraremos
		double superficie;
		double volumen;

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Asignamos al radio introducido el valor devuelto por la función pideRadio()
		radioIntroducido = Principal02.pideRadio();

		// Creamos un objeto de tipo Esfera02 con el valor solicitado al usuario como
		// parámetro
		Esfera02 esfera = new Esfera02(radioIntroducido);

		// Asignamos a la superficie el valor devuelto por la funcion superficie()
		superficie = esfera.superficie();
		// Asignamos al volumen el valor devuelto por la funcion volumen()
		volumen = esfera.volumen();

		// Mostramos los resultados
		System.out.println("Una esfera de radio " + radioIntroducido + " centímetros");
		System.out.println("Tiene una superficie de " + superficie + " cm2");
		System.out.println("Tiene una volumen de " + volumen + " cm3");

		// Cerramos el Scanner
		sc.close();
	}
}
