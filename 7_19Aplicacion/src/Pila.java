import java.util.NoSuchElementException;

public class Pila {
        private int[] elementos;
        private int tope;
    
        public Pila(int capacidad) {
            elementos = new int[capacidad];
            tope = -1;
        }
    
        public void apilar(int elemento) {
            if (tope == elementos.length - 1) {
                throw new StackOverflowError("La pila está llena");
            }
            tope++;
            elementos[tope] = elemento;
        }
    
        public int desapilar() {
            if (tope == -1) {
                throw new NoSuchElementException("La pila está vacía"); //elemento de una secuencia que no existe
            }
            int elemento = elementos[tope];
            tope--;
            return elemento;
        }
    
        public int cima() {
            if (tope == -1) {
                throw new NoSuchElementException("La pila está vacía");
            }
            return elementos[tope];
        }
    
        public boolean estaVacia() {
            return tope == -1;
        }
    
        public int size() {
            return tope + 1;
        }
    }


