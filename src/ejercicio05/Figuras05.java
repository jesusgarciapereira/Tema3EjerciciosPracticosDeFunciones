package ejercicio05;

public class Figuras05 {

	// Atributos
	int lado;
	String caracter;

	// Constructor sin parámetros
	public Figuras05() {

	}

	// Constructor con parámetros
	public Figuras05(int lado, String caracter) {
		this.lado = lado;
		this.caracter = caracter;
	}

	// Función triangulo()
	public void triangulo() {

		// Bucle for para cada fila (desde 1 hasta lado)
		// Fila 1
		// Fila 2
		// Fila 3
		// ...
		// Fila lado
		for (int i = 1; i <= lado; i++) {

			// Cada fila mostrará la cantidad de espacios equivalente al lado - i
			// Fila 1 = lado - 1
			// Fila 2 = lado - 2
			// Fila 3 = lado - 3
			// ...
			// Fila lado = lado - lado (es decir 0)
			for (int j = 1; j <= lado - i; j++) {
				System.out.print(" ");
			}

			// Cada fila mostrará el caracter tantas veces como el número de la fila
			// Fila 1 = 1 caracter
			// Fila 2 = 2 caracteres
			// Fila 3 = 3 caracteres
			// ...
			// Fila lado = lado caracteres
			for (int j = 1; j <= i; j++) {
				System.out.print(caracter + " ");
			}

			// Salto de línea
			System.out.println();
		}
	}

	// Función cuadrado()
	public void cuadrado() {

		// Bucle for para cada fila (desde 1 hasta lado)
		// Fila 1
		// Fila 2
		// Fila 3
		// ...
		// Fila lado
		for (int i = 1; i <= lado; i++) {

			// Cada fila mostrará el caracter tantas veces como el número del lado
			// Fila 1 = lado caracteres
			// Fila 2 = lado caracteres
			// Fila 3 = lado caracteres
			// ...
			// Fila lado = lado caracteres
			for (int j = 1; j <= lado; j++) {
				System.out.print(caracter + " ");
			}

			// Salto de línea
			System.out.println();
		}
	}

	// Función hexagono()
	public void hexagono() {

		// PRIMERA MITAD DEL HEXÁGONO
		// Bucle for para cada fila (desde 0 hasta lado - 1)
		// Fila 0
		// Fila 1
		// Fila 2
		// ...
		// Fila lado - 1
		for (int i = 0; i <= lado - 1; i++) {

			// Cada fila mostrará la cantidad de espacios equivalente al lado - 1 - i
			// Fila 0 = lado - 1 - 0
			// Fila 1 = lado - 1 - 1
			// Fila 2 = lado - 1 - 2
			// ...
			// Fila lado - 1 = lado - 1 - lado - 1 (es decir 0)
			for (int j = 1; j <= lado - 1 - i; j++) {
				System.out.print(" ");
			}

			// Cada fila mostrará el caracter tantas veces equivalente al lado + 2 * i
			// Fila 0 = lado + 2 * 0 (es decir, tantos como el lado)
			// Fila 1 = lado + 2 * 1 (es decir, dos más que el anterior)
			// Fila 2 = lado + 2 * 2 (es decir, dos más que el anterior)
			// ...
			// Fila lado - 1 = lado + 2 * (lado - 1)
			for (int j = 1; j <= lado + 2 * i; j++) {
				System.out.print(caracter);
			}

			// Salto de línea
			System.out.println();
		}

		// SEGUNDA MITAD DEL HEXÁGONO
		// Bucle for para cada fila (desde lado - 2 hasta 0)
		// Fila lado - 2
		// Fila lado - 2 - 1
		// Fila lado - 2 - 2
		// ...
		// Fila 0
		for (int i = lado - 2; i >= 0; i--) {
			
			// Las instrucciones de cada fila son exáctamente iguales a las de la primera
			// mitad del hexágono

			for (int j = 1; j <= lado - 1 - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= lado + 2 * i; j++) {
				System.out.print(caracter);
			}

			// Salto de línea
			System.out.println();
		}
	}

}
