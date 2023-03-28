
public class Cola {
    private Integer[] elementos; // Arreglo que contiene los elementos de la cola
    private int capacidad; // Capacidad máxima de la cola
    private int cabeza; // Índice del primer elemento de la cola
    private int cola; // Índice del siguiente espacio disponible en la cola

    public Cola(int capacidad) { // Constructor de la clase Cola
        this.capacidad = capacidad; // Se asigna la capacidad especificada
        this.elementos = new Integer[capacidad]; // Se crea un arreglo con la capacidad especificada
        this.cabeza = 0; // La cabeza se inicializa en el índice 0
        this.cola = 0; // La cola también se inicializa en el índice 0
    }

    public void encolar(Integer elemento1, Integer elemento2) { // Método para añadir elementos a la cola
        if (cola == capacidad) { // Si la cola está llena, se imprime un mensaje y se retorna
            System.out.println("La cola está llena.");
            return;
        }

        elementos[cola] = elemento1; // Se agrega el primer elemento a la cola
        elementos[cola+1] = elemento2; // Se agrega el segundo elemento a la cola
        cola += 2; // Se actualiza la posición de la cola
    }

    public Integer desencolar() { // Método para eliminar el primer elemento de la cola
        if (cabeza == cola) { // Si la cola está vacía, se imprime un mensaje y se retorna null
            System.out.println("La cola está vacía.");
            return null;
        }

        Integer elemento = elementos[cabeza]; // Se guarda el primer elemento de la cola
        cabeza++; // Se actualiza la posición de la cabeza
        return elemento; // Se retorna el primer elemento de la cola
    }

    public void imprimir() { // Método para imprimir los elementos de la cola
        System.out.println("Elementos encolados: ");
        for (int i = cabeza; i < cola; i+=2) { // Se itera sobre los elementos de la cola de dos en dos
            System.out.println("(" + elementos[i] + ", " + elementos[i+1] + ")"); // Se imprime el par de elementos
        }
    }
}
