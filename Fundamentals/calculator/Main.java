package calculator;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.suma(10, 20, 60, 39, 15, 26);
		float resultadoF = calculadora.suma(10.5f, 20.5f, Calculadora.pi);		
		double resultadoD = calculadora.suma();
		
		System.out.println("Resultado int: " + resultado + "\nResultado Float: " + resultadoF 
						+"\nResultado Double: " + resultadoD);

	}
	
}