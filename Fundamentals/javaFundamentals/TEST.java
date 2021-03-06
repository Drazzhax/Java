package javaFundamentals;

public class TEST {
	
	public static void main(String[] args) {
		
		//Se definen unas cadenas que se van a usar para comparar
		
		String cadena1 = "Paprika";
		String cadena2 = "paprika";		
		
		
		//Equals y operador ternario y discriminaci?n MAYUS-MINUS
		
		System.out.println("Las cadenas son:\n\nCadena 1: " + cadena1 + "\nCadena 2: " + cadena2 + "\nSon similares, pero no iguales\nAhora veamos "
				+ "qu? dice el autentificador:\n");
		
		System.out.println(cadena2.equals(cadena1) ? "Son cadenas id?nticas al: " + 100 + "%" : "Se parecen como una lubina a una casta?a, entre " + 
				0 + " y nada, para parecerse la segunda cadena trend?a que ser as?: " + cadena2.toUpperCase() + "... vamos, claramente.." + "\n..." + "\n......" 
				+ "\n........." + "\n\nUy... Parece que hemos patinado, un problemilla sin importancia" + "\nBueno, solo un poco... no hay que tom?rselo muy a pecho... Vamos, digo yo" 
				+ "\n\nLa respuesta realmente ser?a: " + cadena2.substring(0,1).toUpperCase() + cadena2.substring(1));
		
		System.out.println(cadena2.equalsIgnoreCase(cadena1) ? "\nEn este caso, son identicas... Aunque tambien podemos hacer algo de trampa -IGNORANDO- las mayus" 
				: "\nNi harto de grifa");		
		
	
		System.out.println("");
		
				
		//Pruebas a?adiendo argumentos a un bucle for
		System.out.println("Vamos a otra cosa, es este caso, lo que vamos a hacer, es cascar el print... !Como par?metro de bucle!"
				+ "\n?No me digas que no es genial? !Adem?s nos hemos montado un Fibonacci!" + "\nTal vez un poco guarro, pero lo superaremos... Creo\n");
		for (int cont=0, i =0, x = 1, z=0; cont<20; cont++, System.out.println("Numero " + (cont) + "; " + z), i = x, x = z, z = i + x ) {}
		
		System.out.println();		
		
		
		//Arrays
		
		//Declaraci?n
		
		String nombres[];
		nombres = new String[3];
		
		//Declaraci?n e inicializaci?n

		String cenutrios[] = new String[8];
		@SuppressWarnings("unused")
		String pescados[] = {"Rodaballo", "Lubina", "At?n", "Bacalao", cenutrios[0]};
		
		
		
		//Se aprovechan los argumentos de for, y se transforma una operaci?n en un String
		
		for(int cont=0; cont<3; nombres[cont] = String.valueOf((cont*5+2*7)/4), cont++) {}
		
		System.out.println("Esto lo puedes ignorar, estamos probando un 'String.valueOf' y transformando un calculo con int en String: " 
				+ nombres[0] + ", " +  nombres[1] + ", " + nombres[2]);
		System.out.println("");

		
		
		
		//Obtener media
		
		System.out.println("Vale, aqu? construimos un Array simpl?n, y le asignamos valores directamente, en lugar de un tama?o "
				+ "\nLuego lo recorremos con un 'FOR' y sacamos una media... pero este 'FOR' es un poco especial;" +
				"\nPrimero declaro un entero 'i' y le voy asignando todos los valores del Array:"
				+ "\n\nfor(int i : calificaciones)\n\n" + "Esto se va sumando a la media y bueno...");
		int calificaciones[] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
		int media=0;		
		
		for(int i : calificaciones) {
			media += i;
		}
		
		System.out.println("La media de calificaciones es un: " + media/calificaciones.length + "\n");	
		
		//Arrays 2
		
		System.out.println("Bueno, ahora vamos a usar bucles para rellenar matrices e ir imprimiendolas"
				+ "\nEl valor que le doy a cada... casilla es la suma de sus coordenadas, quedando de la siguiente manera:\n");
		
		int matriz[][] = new int[4][4];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int x = 0; x < matriz[i].length; x++) {
				matriz[i][x] = i+x;
				System.out.println("Posici?n: matriz[" + i + "][" + x + "] = " + matriz[i][x]);
			}
			System.out.println("");
		}
		
		//Obetener informaci?n almacenada, sin saber la posici?n
		
		System.out.println("En esta segunda, desconozco la posici?n, y la recorro a ciegas recuperando los datos almacenados\n");
		for(int[] i : matriz) {
			for(int x : i) {				
				System.out.println("Posici?n: matriz[?][?] = " + x);
			}
		}
		
		System.out.println("\nComo vemos puede tener alguna utilidad... en alg?n caso concreto... O no...\n");
	
		
		//Arrays Din?micos
		System.out.println("Bueno, vamos ahora con los array din?micos (estos si parecen m?s ?tiles)\n"
				+ "Vamos por partes, primero lo declaramos as?:" 
				+ "\n\n	int notas [][] = new int [5][];"
				+ "\n\nComo podemos ver hay que asignarle tama?o al menos a la columna, con respecto a la fila..\n "
				+ "Bueno, nosotros las hemos generado de manera aleatoria, con un tama?o entre 1 y 8: "
				+ "\n\n	for(int x = 0; x<notas.length; x++) {\r\n"
				+ "			notas[x] = new int [(int) (Math.random()*8+1)];\r\n"
				+ "		}"
				+ "\nY bueno, luego que si 'FOR' por aqu?, que si 'Math.random' por all? para asignarle notas entre 0 y 10 a esta gente.");
		
		int notas [][] = new int [5][];
		
		for(int x = 0; x<notas.length; x++) {
			notas[x] = new int [(int) (Math.random()*8+1)];
		}
		
		for(int i = 0; i < notas.length; i++) {			
			System.out.print("\nEl alumno n?mero " + (i+1) + " ha sacado las siguientes notas : "); 
			for (int x = 0; x < notas[i].length; x++) {
				notas[i][x] = (int)(Math.random()*11);
				System.out.print(notas[i][x] + " ");			
			}
		}
		System.out.println("\n\n?sto es lo mismo que el anterior pero recogiendo solo los resultados con el famoso:\n"
				+ "	for(int [] Potato : array)\n"
				+ "		for (int Miel : Potato) \n");
		
		int i = 0;
		for(int []notas1 : notas) {
			i += 1;
			System.out.print("\nEl alumno n?mero " + (i) + " ha sacado las siguientes notas : "); 
			for (int calificacion : notas1) {				
				calificacion = (int)(Math.random()*11);
				System.out.print(calificacion + " ");			
			}
		}
		
		System.out.print("\nHora de continuar con lo siguiente:\n"); 
		
		
	}	
}