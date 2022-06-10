package calculator;

public class Calculadora {
	
	public static final float pi = 3.1415f;

	public int suma(int... numeros) { //n cantidad de parámetros de tipo int, es un array
		int suma = 0;
		for (int numero : numeros) {
			suma+=numero;
		}
		return suma;
	}
	
	public float suma(float... numeros) {
		float suma = 0;
		for (float numero : numeros) {
			suma+=numero;
		}
		return suma;
	}
	
	public double suma(double... numeros) {
		double suma = 0;
		for (double numero : numeros) {
			suma+=numero;
		}
		return suma;
	}
	
}
