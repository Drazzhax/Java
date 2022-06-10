package clasesObjetos;
import java.util.*;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		// Investiguemos el maravilloso mundo de las herencias
		
		
/*
 		//Primeras palabras
 
		System.out.println("INICIANDO");
		System.out.println("Introduzca los datos de su gato");		
		

		Scanner teclado = new Scanner(System.in);
		
		//Creaci�n de objeto a medida
		Gato gato1 = new Gato();
		System.out.print("Introduzca el nombre del animaluco: ");
		String nombre = teclado.nextLine();
		
        System.out.print("Introduzca la raza de " + nombre);
        String raza = teclado.nextLine();                 
        
        System.out.print("Introduzca la edad de " + nombre);
        int edad = teclado.nextInt();
       
		gato1.establecerAtributos(nombre, raza, edad);
		
		System.out.println("El nombre de este ser es: " + gato1.nombre);
		System.out.println("La raza de " + gato1.nombre +" es: " + gato1.raza);
		System.out.println("La antig�edad de este ser es de " + gato1.edad + " siglos... " + gato1.nombre + " empieza a estar viejo"
				+ "\n�O tal vez sea inmortal?\n");
		
*/			
		
		//Gato de prueba
		
		Gato gorflo = new Gato(); //Al Gorflo (objeto creado) se lo denomina instancia
		Comedero plato1 = new Comedero();
		
		gorflo.establecerAtributos("Gandorflo", "Superior", 25);
		
		System.out.println("El nombre de este ser es: " + gorflo.nombre);
		System.out.println("La raza de " + gorflo.nombre +" es: " + gorflo.raza);
		System.out.println("La antig�edad de este ser es de " + gorflo.edad + " siglos... " + gorflo.nombre + " empieza a estar viejo"
				+ "\n�O tal vez sea inmortal?\n");
		
		
		//Acciones de prueba
		
		plato1.rellenar();
		
		gorflo.comer(plato1.cantidad);
		plato1.comer();
		
		gorflo.dormir();
		gorflo.rondar();
				
	}
	
	
/*	//Intento de menu
	public void menu() {
		
		Scanner teclado = new Scanner(System.in);
		Comedero plato1;
		int eleccion = 0;
		
		while (eleccion != 3){
			
			System.out.println("Selecciona qu� hacer:" 
					+ "\n1. Rellenar comida" 
					+ "\n2. Dejar al gato comer" 
					+ "\n3. Salir");
			
			eleccion = teclado.nextInt();
			switch (eleccion) {
				case 1: 					
					break;
				case 2: 					
					break;
				case 3: 					
					break;				
			}		
		}		
	}
*/
}
