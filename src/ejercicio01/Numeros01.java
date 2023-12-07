package ejercicio01;

public class Numeros01 {

	// Atributos
	int numero;

	// Constructor sin parámetros
	public Numeros01() {
		
	}
	
	// Constructor con parámetros
	public Numeros01(int numero) {
		this.numero = numero;
	}

	// Función esPrimo()
	public boolean esPrimo() {
		// Variable esPrimo, inicializada como true
		boolean esPrimo = true;
		
		// Bucle for desde el 2 hasta la raíz cuadrada del número
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			// Si uno de los valores del contador es divisor del número
			if (numero % i == 0) {
				// Asignamos false a esPrimo y rompemos el bucle
				esPrimo = false;
				break;
			}
		}
		
		// La función devolverá el valor de esPrimo
		return esPrimo;
	}

	// Función esCapicua()
	public boolean esCapicua() {
		// Variable esCapicua, inicializada como false
		boolean esCapicua = false;
		// Variable para hacer los cálculos y conservar el número original
		int numeroAux;
		// Variable del número invertido
		int numeroInvertido;

		// Inicializamos el número auxiliar como copia del número original
		numeroAux = numero;
		// Inicializamos el número invertido en 0
		numeroInvertido = 0;

		// Mientras queden digitos en el número auxiliar, repetiremos estas
		// instrucciones
		while (numeroAux > 0) {
			// Obtenemos el último dígito del número auxiliar y lo agregamos al número
			// invertido
			numeroInvertido = numeroInvertido * 10 + numeroAux % 10;
			// Eliminamos el último dígito del número auxiliar
			numeroAux /= 10;
		}

		// Si el número original es igual al número invertido
		if (numero == numeroInvertido)
			// Asignamos true a esCapicua
			esCapicua = true;

		// La función devolverá el valor de esCapicua
		return esCapicua;
	}

}
