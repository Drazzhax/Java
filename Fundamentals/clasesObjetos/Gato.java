package clasesObjetos;

public class Gato {

   String nombre;
   String raza;
   int edad;

   //Par?metros

   void establecerAtributos(String nombre, String raza, int edad) {
      this.nombre = nombre;
      this.raza = raza;
      this.edad = edad;
   }

   void comer(int cantidad) {

      switch (cantidad) {
      case 3:
         System.out.println(nombre + " se emociona ante la monta?a de comida y la ataca sin miramientos");
         break;
      case 2:
         System.out.println(nombre + " no hace m?s que zampar!");
         break;
      case 1:
         System.out.println(nombre + " ha devorado lo que quedaba en el plato");
         break;
      default:
         System.out.println(nombre + " carece de comida, as? que se pone a masticar lo primero que encuentra");
      }

   }

   void dormir() {
      System.out.println(nombre + " est? completamente roque");
   }
   void rondar() {
      System.out.println(nombre + " ronda avisamente...\n?Deja de morder el cable!");
   }

}