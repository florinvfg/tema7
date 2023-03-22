/*  7.12
Añadir a la clase Lista el metodo estatico:
Lista concatena(Lista l1, Lista l2)
que construye y devuelve una lista que contiene,en el mismo orden,una copia de todos
los elementos de l1 y l2
  
 */


public class main {
    public static void main(String[] args) throws Exception {
       
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        
        l1.insertarFinal(1); l1.insertarFinal(1); l1.insertarFinal(2);
        l1.insertarFinal(3); 
        l2.insertarFinal(10); l2.insertarFinal(20); l2.insertarFinal(30);
        Lista concatenacion = Lista.concatena(l1, l2);
        concatenacion.mostrar();
    }
}
