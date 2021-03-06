package clasesObjetos;
import java.util.*;

public class Main {

   public static void main(String[] args) {
      // Investiguemos el maravilloso mundo de las herencias

      //Gato de prueba

      Gato gorflo = new Gato(); //Al Gorflo (objeto creado) se lo denomina instancia
      Comedero plato1 = new Comedero();

      gorflo.establecerAtributos("Gandorflo", "Superior", 25);

      saludo(gorflo.nombre, gorflo.raza, gorflo.edad);

      //Acciones de prueba

      plato1.rellenar();

      while (plato1.cantidad >= 0) {
         gorflo.comer(plato1.cantidad);
         plato1.comer();
      }

      gorflo.dormir();
      gorflo.rondar();

   }

   @SuppressWarnings("resource")
   public static void invocarGato() {
      //Primeras palabras
      System.out.println("\nINICIANDO");
      System.out.println("Introduzca los datos de su gato:\n");

      Scanner teclado = new Scanner(System.in);

      //Creaci?n de objeto a medida
      Gato gato1 = new Gato();
      System.out.print("Cual es el nombre del animaluco?: ");
      String nombre = teclado.nextLine();

      System.out.print("Introduzca la raza de " + nombre + ": ");
      String raza = teclado.nextLine();

      System.out.print("Introduzca la edad de " + nombre + ": ");
      int edad = teclado.nextInt();

      gato1.establecerAtributos(nombre, raza, edad);

      System.out.println();
      saludo(gato1.nombre, gato1.raza, gato1.edad);
   }

   public static void saludo(String nombre, String raza, int edad) {
      System.out.println("El nombre de este ser es: " + nombre);
      System.out.println("La raza de " + nombre + " es: " + raza);
      System.out.println("La antig?edad de este ser es de " + edad + " siglos... " + nombre + " empieza a estar viejo." +
         "\n?O tal vez sea inmortal?\n");
   }
}