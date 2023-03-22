package personal;

import java.time.LocalDate;
import java.util.Date;

public class JefeEstacion {
    String nombre;
    String dni;
    LocalDate nombramiento;

    public JefeEstacion(String nombre, String dni, LocalDate localDate) {
        this.nombre = nombre;
        this.dni = dni;
        this.nombramiento = localDate;
    }
}
