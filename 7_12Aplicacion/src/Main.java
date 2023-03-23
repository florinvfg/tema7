/* 7.12
Implementa una clase que permita resolver ecuaciones de segundo grado.Los coeficientes pueden
indicarse en el constructor y modificarse a posteriori.Es fundamental que la clase disponga de un metodo
que devuelva las distintas soluciones y de un metodo que nos informe si el disriminante es positivo.
    
 * 
 * 
 */

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso de la clase EcuacionSegundoGrado
        EcuacionSegundoGrado ecuacion2 = new EcuacionSegundoGrado(8.0, 5.0, -3.0);
        double[] soluciones2 = ecuacion2.calcularSoluciones();
        System.out.println(
                "Ecuación: " + ecuacion2.getA() + "x^2 + " + ecuacion2.getB() + "x + " + ecuacion2.getC() + " = 0");
        if (soluciones2 == null) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else if (soluciones2.length == 1) {
            System.out.println("La ecuación tiene una solución real: " + soluciones2[0]);
        } else {
            System.out.println("La ecuación tiene dos soluciones reales: " + soluciones2[0] + " y " + soluciones2[1]);
        }
        if (ecuacion2.tieneSolucion()) {
            System.out.println("La ecuación tiene solución.");
        } else {
            System.out.println("La ecuación no tiene solución.");
        }
    }
}