
package Ejercicio7_1;

class CuentaCorriente {
    String dni; // del titular
    String nombre; // del titular
    double saldo; // efectivo disponible en la cuenta
    /*
     * Los parametros de entrada:nombre y dni,ocultan a los atributos de la clase
     * con el mismo identificador.Para acceder a ellos hay que utilizar this
     */

    CuentaCorriente(String dni, String nombre) { // constructor
        this.dni = dni; // pasado DNI como parametro
        this.nombre = nombre; // nombre como parametro
        saldo = 0; // saignamos el saldo por defecto
    }

    CuentaCorriente(String dni) { // constructor
        this.dni = dni; // pasado DNI como parametro
            this.nombre = "vacio"; //nombre como parametro
            saldo = 0; //saignamos el saldo por defecto
       }

    boolean egreso(double cant) { // sacar dinero de la cuenta

        boolean operacionPosible = false;
        if (saldo >= cant) { // si disponemos de saldo suficiente
            saldo -= cant;
            operacionPosible = true;
        } else { // no hay saldo disponible
            System.out.println(" Fondos insuficientes ");
            operacionPosible = false;
        }
        return (operacionPosible);
    }

    void ingreso(double cant) { // ingresar dinero
        saldo += cant;
    }

    void mostrarInformacion() { // mostrar el estado de la cuenta corriente
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Dni: " + dni);
        System.out.println(" Saldo: " + saldo + " euros ");
    }
}