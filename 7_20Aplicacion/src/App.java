/* 7.20
Repite la actividad de aplicacion 7.18,usando una lista para guardar los elementos encolados.
*/




public class App {

        public static void main(String[] args) {
            Cola cola = new Cola(10);
            cola.encolar(1, 2);
            cola.encolar(3, 4);
            cola.encolar(5, 6);
            cola.imprimir();
            cola.desencolar();
            cola.imprimir();
    }
}
