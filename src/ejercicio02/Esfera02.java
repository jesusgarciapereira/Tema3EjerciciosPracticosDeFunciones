package ejercicio02;

public class Esfera02 {
	
	// Atributos
	double radio;
	
	// Constructor sin parámetros
	public Esfera02() {

	}

	// Constructor con parámetros
	public Esfera02(double radio) {
		this.radio = radio;
	}
	
	// Función superficie()
	public double superficie() {
		// Constante número pi
		final double PI = Math.PI;
		// Variable superficie
		double superficie;
		// Asignamos la fórmula a la variable
		superficie = 4 * PI * Math.pow(radio, 2);
		// La función devolverá el valor de la superficie
		return superficie;
	}
	
	// Función volumen()
	public double volumen() {
		// Constante número pi
		final double PI = Math.PI;
		// Variable volumen
		double volumen;
		// Asignamos la fórmula a la variable
		volumen = 4 * PI / 3 * Math.pow(radio, 3);
		// La función devolverá el valor del volumen
		return volumen;
	}
	
}
