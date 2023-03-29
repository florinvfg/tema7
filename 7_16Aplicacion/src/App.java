/*/  7.16
Escribe la clase Punto que representa un punto en el plano (con un componente x y un componente y),con los metodos:
-Punto(double x, double y): costruye un objeto con los datos pasados como parametros.
-void despazaX(double dx): incrementa el componente x en la cantidad dx.
-void desplazaY(double dy): incrementa el componente y en la catidad dy.
-void desplaza(double dx, double dy): desplaza ambos componentes segun las cantidades dx(en el eje x)y dy(en el componente y).
-double distanciaeuclidea(Punto otro): calcula y devuelve la distancia euclidea emtre el punto invocante y el punto otro.
-void muestra(): muestra por consola la informacion relativa al punto.
 */


public class App {
    public static void main(String[] args) throws Exception {
      // Creamos dos objetos de la clase Punto
      Punto punto1 = new Punto(2.0, 3.0);
      Punto punto2 = new Punto(5.0, 7.0);
      
      // Mostramos las coordenadas de los dos puntos
      punto1.muestra();
      punto2.muestra();
      
      // Desplazamos el primer punto 1 unidad hacia la derecha y 2 unidades hacia arriba
      punto1.desplaza(1.0, 2.0);
      
      // Mostramos las coordenadas del primer punto después del desplazamiento
      punto1.muestra();
      
      // Calculamos la distancia entre los dos puntos
      double distancia = punto1.distanciaEuclidea(punto2);
      System.out.println("La distancia entre los dos puntos es: " + distancia);  
    }
}
