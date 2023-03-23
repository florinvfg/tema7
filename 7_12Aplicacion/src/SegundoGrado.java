public class SegundoGrado {
    public class ecuacionSegundoGrado {
        private double a;
        private double b;
        private double c;
        private double discriminante;
    
        public void EcuacionSegundoGrado(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.discriminante = b * b - 4 * a * c;
        }
    
        public void setA(double a) {
            this.a = a;
            this.discriminante = b * b - 4 * a * c;
        }
    
        public void setB(double b) {
            this.b = b;
            this.discriminante = b * b - 4 * a * c;
        }
    
        public void setC(double c) {
            this.c = c;
            this.discriminante = b * b - 4 * a * c;
        }
    
        public boolean tieneSolucion() {
            return discriminante >= 0;
        }
    
        public double[] solucion() {
            if (!tieneSolucion()) {
                return null;
            }
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            if (x1 == x2) {
                return new double[] { x1 };
            }
            return new double[] { x1, x2 };
        }
    } 
}
