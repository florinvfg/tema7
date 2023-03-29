/*  7.15
Diseña la clase Calendario que representa una fecha concreta(año,mes y dia).La clase debe disponer de los
metodos:
-Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados como parametro,siempre y
cuando,la fecha que representen sea correcta.
-void incrementarDia(): que incrementa en un dia la fecha del calendario.
-void incrementarMes(): que incrementa en un mes la fecha del calendari.
-void incrementarAño(int cantidad): que incrementa la fecha del calendario en el numero de años especificados.
ten en cuenta que el año 0 no existe.
-void mostrar(): muestra la fecha por consola
-boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que  se pasa como parametro son iguales o distintas.
Por simplicidad,solo tendremos en concideracion que existen meses con distinto numero de dias,pero no tendremos en cuenta los años bisiestos.
 * 
 */




import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        /*Calendario calendario = new Calendario(2020, 1, 1);
        System.out.println(calendario);
        calendario.incrementarDia();
        System.out.println(calendario);
        calendario.incrementarMes();
        System.out.println(calendario);
        calendario.incrementarAño(2);
        System.out.println(calendario);
        calendario.mostrar();
        System.out.println(calendario.iguales(new Calendario(2020, 1, 1)));
        System.out.println(calendario.iguales(new Calendario(2020, 2, 1)));
        */

        Calendario fecha = new Calendario(2023, 3, 23); // 2023-03-23
        fecha.mostrar(); // Muestra "23/3/2023"
        fecha.incrementarDia(); // 2023-03-24
        fecha.mostrar(); // Muestra "24/3/2023"
        fecha.incrementarMes(); // 2023-04-01
        fecha.mostrar(); // Muestra "24/4/2023"
        fecha.incrementarAño(2); // 2023-04-02
        fecha.mostrar(); // Muestra "24/4/2025"
        Calendario otraFecha = new Calendario(2023, 3, 23);
        boolean sonIguales = fecha.iguales(otraFecha); // true
        System.out.println(sonIguales); // Muestra "true"
    }
}
