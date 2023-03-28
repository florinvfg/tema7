/*  7.18

Una cola es otra estructura dinamica como la pila,domde los elementos, en vez de apilarse y desapilarse,se encolan y desencolan.
La diferencia con las pilas es que se desencola el primer elemento encolado,ya que asi es como funcionan las cola de autobus o
 del cine.El primero que llega es el primero que sale de la cola (vamos a suponer que nadie se cuela).Por tanto.los elementos se
  encolan y desencolan en extremos opuestos de la estructura,llamados primero (el que esta primero y sera el proximo en abandonar
   la cola) y ultimo (el que llego ultimo).Implementaria la clase Cola donde dos elementos Integer encolados se guardan en una tabla.
*/





public class Main {
    public static void main(String[] args) throws Exception {
        Cola cola = new Cola(10); // Se crea una cola con capacidad máxima de 10 elementos
        cola.encolar(1, 2); // Se agregan dos elementos a la cola
        cola.encolar(3, 4); // Se agregan otros dos elementos a la cola
        cola.encolar(5, 6); // Se agregan otros dos elementos a la cola
        cola.imprimir(); // Se imprimen los elementos de la cola
        cola.desencolar(); // Se elimina el primer elemento de la cola
        cola.imprimir(); // Se imprimen los elementos de la cola actualizada
    }
}
