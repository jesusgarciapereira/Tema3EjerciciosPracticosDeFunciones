package ejercicio04;

public class FuncionesRecursivas04 {

	// Función sumatorio(int numero)
	public static int sumatorio(int numero) {
		// Variable resultado
		int resultado;

		// Caso base, no vuelve a llamar a la función recursiva
		if (numero == 1)
			// Si el parámetro es 1, el resultado será 1
			resultado = 1;
		// Caso recursivo, llama de nuevo a la función recursiva
		else
			// El resultado será la suma todos los números enteros desde el valor del
			// parámetro hasta el 1
			resultado = numero + FuncionesRecursivas04.sumatorio(numero - 1);

		// La función devolverá el valor del resultado
		return resultado;
	}

	// Función potencia(double a, int n)
	public static double potencia(double a, int n) {
		// Variable resultado
		double resultado;

		// Si la base es 0
		if (a == 0)
			// El resultado es 0
			resultado = 0;
		// Si la base no es 0
		else {
			// Caso base, no vuelve a llamar a la función recursiva
			if (n == 0)
				// Si el exponente es 0, el resultado es 1
				resultado = 1;
			// Caso recursivo, llama de nuevo a la función recursiva
			else
				// El resultado será la multiplicación de la base por sí misma n veces
				resultado = a * FuncionesRecursivas04.potencia(a, n - 1);
		}

		// La función devolverá el valor del resultado
		return resultado;
	}

	// Función serieFibonacci(int numero)
	public static int serieFibonacci(int numero) {
		// Variable resultado
		int resultado;

		// Caso base, no vuelve a llamar a la función recursiva
		if (numero == 0)
			// Si el número es 0, el resultado es 0
			resultado = 0;
		// Caso base, no vuelve a llamar a la función recursiva
		else if (numero == 1)
			// Si el número es 1, el resultado es 1
			resultado = 1;
		// Caso recursivo, llama de nuevo a la función recursiva
		else
			// El resultado será la suma de los dos números anteriores en la serie
			resultado = FuncionesRecursivas04.serieFibonacci(numero - 1)
					+ FuncionesRecursivas04.serieFibonacci(numero - 2);

		// La función devolverá el valor del resultado
		return resultado;

	}
}
