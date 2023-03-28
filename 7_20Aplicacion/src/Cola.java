import java.util.ArrayList;

public class Cola {
    private int capacidad;
    private ArrayList<Integer> elementos;

    public Cola(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new ArrayList<Integer>();
    }
    
    public void encolar(Integer elemento1, Integer elemento2) {
        if (elementos.size() + 2 > capacidad) {
            System.out.println("La cola está llena.");
            return;
        }
    
        elementos.add(elemento1);
        elementos.add(elemento2);
    }
    
    public Integer desencolar() {
        if (elementos.isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }
    
        Integer elemento = elementos.get(0);
        elementos.remove(0);
        return elemento;
    }
    
    public void imprimir() {
        System.out.println("Elementos encolados: ");
        for (int i = 0; i < elementos.size(); i+=2) {
            System.out.println("(" + elementos.get(i) + ", " + elementos.get(i+1) + ")");
        }
    }
}
