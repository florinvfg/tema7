
public class Calendario {
    private int año;
    private int mes;
    private int dia;

    public Calendario(int año, int mes, int dia) {
        if (fechaEsValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Fecha inválida");
        }
    }

    public void incrementarDia() {
        if (dia < diasEnMes(año, mes)) {
            dia++;
        } else {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        if (mes < 12) { // Si el mes es menor que 12
            mes++; // incrementamos el mes
        } else {  
            mes = 1; // Si el mes es mayor que 12
            incrementarAño(1); // Si el año es menor que 1000
        }
    }

    public void incrementarAño(int cantidad) { // Si el año es menor que 1000
        if (año + cantidad > 0) {  // si el año es mayor que 0
            año += cantidad;
        } else {
            throw new IllegalArgumentException("Año inválido"); // si el año es menor que 0
        }
    }

    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + año); // Imprimimos la fecha
    }

    public boolean iguales(Calendario otraFecha) { // Comprueba si dos fechas son iguales
        return this.año == otraFecha.año &&  // Comprueba si el año es igual a otra fecha.
               this.mes == otraFecha.mes &&  // Comprueba si el mes es igual a otra fecha.
               this.dia == otraFecha.dia;    // Comprueba si el dia es igual a otra fecha.
    }

    private boolean fechaEsValida(int año, int mes, int dia) { // Comprueba si la fecha es válida
        if (año < 0 || año > 9999 || mes < 1) {
            System.out.println("Año inválido"); // Imprimimos la fecha
            return false; // Devolvemos false

        } 

}
