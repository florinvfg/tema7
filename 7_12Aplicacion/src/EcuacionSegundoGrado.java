
public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA() {
        return a;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getB() {
        return b;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public double getC() {
        return c;
    }
    
    public void setC(double c) {
        this.c = c;
    }
    
    public double[] calcularSoluciones() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            return new double[0]; // sin soluciones reales
        } else if (discriminante == 0) {
            return new double[] {-b / (2 * a)}; // una solución real
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return new double[] {x1, x2}; // dos soluciones reales
        }
    }
    
    public boolean tieneDiscriminantePositivo() {
        double discriminante = b * b - 4 * a * c;
        return discriminante > 0;
    }

    public boolean tieneSolucion() {
        return false;
    }

    public double[] solucion() {
        return null;
    }
}







