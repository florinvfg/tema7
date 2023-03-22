/*  7.11
Las listas son estructuras dinamicas de datos donde se puede insertar o elimunar elementos de un determinado tipo
de espacio.Implementar la clase LISTA correspondiente a una lista de numeros de la clase INTEGER.Los numeros se guardan 
en una tabla que se redimensionara can las inserciones y eliminaciones,aumentando o disminuyendo la capacidad de la lista
segun el caso.
Entre los metodos de la clase,se incluiran las siguientes tareas:
-Un constructor que incialice la tabla con un tamaño 0.
-Obtener el numero de elementos insertados en la lista.
-Insertar un numero al final de la lista.
-Insertar un numero al principio de la lista.
-Insertar un numero en el lugar de la lista cuyo indice,que es el de la tabla,se pasa como parametro.
-Aniadir al final de la lista los elementos de otra lista que se pasa como parametro.
-Eliminar un elemento cuyo indice se pasa como parametro.
-Buscar un numero en la lista,devolviendo el indice del primer lugar donde se encuentre.Si no esta,volvera-1
-Mostrar los elementos de la lista por consola.
*/









public class Main {
    // prueba de los metodos de la clase LISTA
    public static void main(String[] args) throws Exception {
      Lista l1 = new Lista();
      Lista l2 = new Lista();
      l1.insertarFinal(4);
      l1.insertarFinal(5);
      l1.insertarFinal(6);
      l1.mostrar();
      l1.insertarPrincipio(3);
      l1.insertarPrincipio(2);
      l1.insertarPrincipio(1);
      l1.mostrar();
      l1.insertar(2, 99);
      l1.mostrar();
      l1.eliminar(2);
      l1.mostrar();
      System.out.println(l1.buscar (4));
      l2.insertarFinal(10);
      l2.insertarFinal(20);
      l2.insertarFinal(30);
      l2.insertarFinal(40);
      l2.insertarFinal(50);
      l2.mostrar();
      l1.insertarFinal(12);
      l1.mostrar();
  
    }
}
