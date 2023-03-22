package personal;

public class Mecanico {
    String nombre;
    String telefono;

    enum Espesialidad {
        FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR
    }

    Espesialidad espesialidad;

    public Mecanico(String nombre, String telefono, String espesialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.espesialidad = Espesialidad.valueOf(espesialidad);
    }
}
