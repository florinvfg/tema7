

public class Gestor {

    public String nombre;
    private String tlf; // numero con el que no se opera: es usual usar String
    double importeMax; // visibilidad por defecto

    public Gestor(String nombre, String tlf, double importMax) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMax = importeMax;
    }

    public Gestor(String nombre, String tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMax = 10000.0; //asignamos  el importe maximo por defecto

    }

    String getTlf() { // al ser tlf privado permite consultar el telefono de un gestor
        return tlf;
    }

    void mostrarInformacion() {
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Telefono: " + tlf);
        System.out.println(" Importe maximo: " + importeMax + " euros ");
    }
    
}
