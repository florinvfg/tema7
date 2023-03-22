/*  7.14
Implementar el metodo no estatico
  void insertarFinal(int nuevo)
  que inserta un numero entero al final de tablaEnteros[],que es un atributo no estatico de la clase Main.
  Escribir un programa que inicie la tabla con los numeros del 1-10 y despues la muestre por consola
 
 */
import java.util.Arrays;
public class Main {
    int[] tablaEnteros = new int[0];
    public static void main(String[] args)  {
        Main m = new Main();
        for (int i = 1; i <= 10; i++) {
            m.insertarFinal(i + 1);
    
    }
    System.out.println("tabla: " + Arrays.toString(m.tablaEnteros));
}
void insertarFinal(int nuevo) {
    tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length + 1);
    tablaEnteros[tablaEnteros.length - 1] = nuevo;
}
}
