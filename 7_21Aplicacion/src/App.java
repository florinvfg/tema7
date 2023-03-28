/*  7.21

Un conjunto es una estructura dinamica de datos como la lista,con dos diferencias:en primer lugar,en una lista puede haber elemntos repetidos,mientras que en un conjunto,no.Ademas,en una lista el orden de insercion de los elementos puede ser relevante y deberemos tenerlo en cuenta,mientras que en un conjunto solo interesa si un elemento pertenece o no al conjunto y no el lugar que ocupa.Se pide implementar la clase Conjunto utilizando una lista para almacenar numeros de tipo Integer.Imolementa los siguientes metodos:
-un constructor sin parametros.
-int numeroElementos(): devuelve el numero de elemntos del conjunto.
-boolean insertar(Integer nuevo): inserta un nuevo elemento en el conjunto.
-boolean insertar(Conjunto otroConjunto): añade al conjunto los elementos del conjunto otroConjunto.
-boolean eliminarElemento(Integer elemento): en caso de pertenecer al conjunto,elimina elemento.
-boolean eliminarConjunto(Conjunto otroConjunto): elimina conjunto invocante los elementos del conjunto que se pasa como parametro.
-boolean pertenece(Integer elemento): indica si el elemento que se le pasa como parametro pertenece o no al conjunto.
-muestra(): muestra el cojunto por consola.

De forma general,los metodos que devuelven un booleano indican con el si el conjunto se ha modificado.

 * 
 */




public class App {
  

        public static void main(String[] args) {
    
            // Creamos dos conjuntos
            Conjunto conjunto1 = new Conjunto(); // 1
            Conjunto conjunto2 = new Conjunto(); // 2
    
            // Insertamos elementos en el conjunto1
            conjunto1.insertar(1); 
            conjunto1.insertar(2); 
            conjunto1.insertar(3);
            conjunto1.insertar(4);
    
            // Insertamos elementos en el conjunto2
            conjunto2.insertar(3);
            conjunto2.insertar(4);
            conjunto2.insertar(5);
            conjunto2.insertar(6);
    
            // Mostramos los elementos de cada conjunto
            System.out.print("Conjunto 1: "); 
            conjunto1.muestra();
            System.out.print("Conjunto 2: ");
            conjunto2.muestra();
    
            // Eliminamos un elemento del conjunto1
            conjunto1.eliminarElemento(2);
    
            // Mostramos el conjunto1 modificado
            System.out.print("Conjunto 1 modificado: ");
            conjunto1.muestra();
    
            // Eliminamos los elementos del conjunto2 que están en el conjunto1
            conjunto2.eliminarConjunto(conjunto1);
    
            // Mostramos el conjunto2 modificado
            System.out.print("Conjunto 2 modificado: ");
            conjunto2.muestra();
    
            // Insertamos el conjunto1 en el conjunto2
            conjunto2.insertar(conjunto1);
    
            // Mostramos el conjunto2 final
            System.out.print("Conjunto 2 final: ");
            conjunto2.muestra();
    
            // Comprobamos si un elemento pertenece al conjunto1
            if (conjunto1.pertenece(3)) {
                System.out.println("El elemento 3 pertenece al conjunto 1");
            } else {
                System.out.println("El elemento 3 no pertenece al conjunto 1");
            }
    
        }
    
    } 

