

    import java.util.ArrayList;
    import java.util.List;
    
    public class Conjunto {
    
        private List<Integer> elementos; // Lista de elementos
    
        public Conjunto() { // Constructor
            this.elementos = new ArrayList<>(); // es el constructor que crea un nuevo conjunto vacío.
        }
    
        public int numeroElementos() { // devuelve el tamaño del conjunto.
            return elementos.size(); 
        }
    
        public boolean insertar(Integer nuevo) { // inserta un elemento en el conjunto.
            if (!elementos.contains(nuevo)) { // si el elemento no está en el conjunto.
                elementos.add(nuevo); // añade el elemento al conjunto.
                return true; // devuelve true.
            }
            return false; // devuelve false.
        }
    
        public boolean insertar(Conjunto otroConjunto) { // inserta un conjunto en el conjunto.
            boolean modificado = false; // devuelve true si se modificó el conjunto.
            for (Integer elemento : otroConjunto.elementos) { // recorre el conjunto.
                if (insertar(elemento)) { // si se modificó el conjunto.
                    modificado = true; // devuelve true.
                }
            }
            return modificado; // devuelve true si se modificó el conjunto.
        }
    
        public boolean eliminarElemento(Integer elemento) { // elimina un elemento del conjunto.
            return elementos.remove(elemento); // devuelve true si se elimino el elemento.
        }
    
        public boolean eliminarConjunto(Conjunto otroConjunto) { // elimina un conjunto del conjunto.
            return elementos.removeAll(otroConjunto.elementos); // devuelve true si se elimino el conjunto.
        }
    
        public boolean pertenece(Integer elemento) { // devuelve true si el elemento está en el conjunto.
            return elementos.contains(elemento); // devuelve true si el elemento está en el conjunto.
        }
    
        public void muestra() {  // muestra el conjunto.
            System.out.print("{ "); // muestra el conjunto.
            for (Integer elemento : elementos) { // recorre el conjunto.
                System.out.print(elemento + " "); // muestra el elemento.
            }
            System.out.println("}"); // muestra el conjunto.
        }
    
    }

