package clasesObjetos;

public class Comedero {

   int cantidad;

   public void rellenar() {
      cantidad = 3;
      System.out.println("Has rellenado el plato, hay " + cantidad + " raciones");
   }

   public int comer() {
      if (cantidad > 0) {
         cantidad--;
         if (cantidad > 0) {
            System.out.println(cantidad > 1 ? "Quedan " + cantidad + " raciones\n" : "Queda " + cantidad + " racion\n");
         } else {
            System.out.println("No quedan raciones\n");
         }

      } else {
         System.out.println("El comedero esta vacío así que no le queda otra que comer piedras" +
            "\n¡Rellénalo, gentuza!\n");
      }
      return cantidad;

   }

}