
public class Punto {

    /*public Punto(double d, double e) { //Constructor
        
    

    }

    public void muestra() {
    }

    public void desplaza(double d, double e) {
    }

    public double distanciaEuclidea(Punto punto2) {
        return 0;*/
        private double x;
    private double y;
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void desplazaX(double dx) {
        this.x += dx;
    }
    
    public void desplazaY(double dy) {
        this.y += dy;
    }
    
    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public double distanciaEuclidea(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public void muestra() {
        System.out.println("Coordenadas del punto: (" + this.x + ", " + this.y + ")");
    }
    }


