package maquinaria;


   
import java.time.LocalDate;

import personal.*;
public class Main {
      // Crear empleados
      Maquinista maquinista1 = new Maquinista("Juan Perez", "12345678A", 2000, "Rango 1");
      Mecanico mecanico1 = new Mecanico("Pedro Gomez", "555-123-456", "Hidráulica");
      JefeEstacion jefe1 = new JefeEstacion("Ana Rodriguez", "11111111C", LocalDate.of(2021, 3, 12));
      //enganchaVagon(int cargaMax, int cargaActual, String mercancia)
      // Crear vagones
      Vagon vagon1 = new Vagon(1, 5000, 2000, "Carbón");
      Vagon vagon2 = new Vagon(2, 7000, 6000, "Petróleo");

      // Crear locomotoras
      Locomotora locomotora1 = new Locomotora("ABC123", 1000, 10, mecanico1);

      // Crear tren
      Tren tren1 = new Tren(locomotora1, maquinista1);
      tren1.enganchaVagon(5000, 2300, "papel");
    
}
    

