import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la capacidad de la pila: ");
        int capacidad = sc.nextInt();
        Pila pila = new Pila(capacidad);

        System.out.println("Introduce los elementos a apilar (introduce -1 para dejar de apilar):");
        int elemento = sc.nextInt();
        while (elemento != -1) {
            try {
                pila.apilar(elemento);
            } catch (StackOverflowError e) {
                System.out.println(e.getMessage());
            }
            elemento = sc.nextInt();
        }

        System.out.println("La pila tiene " + pila.size() + " elementos");
        while (!pila.estaVacia()) {
            System.out.println("Cima: " + pila.cima());
            try {
                int valorDesapilado = pila.desapilar();
                System.out.println("Desapilado: " + valorDesapilado);
            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

