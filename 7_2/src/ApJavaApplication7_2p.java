/*7.2

En la clase CuentaCoriente sobrecargar los constructores para poder crear objetos.
-Con el DNI del titular de la cuenta y un saldo inicial
-Con el DNI,nombre y el saldo inicial.
Escribir un programa que compruebe el funcionamiento de los metodos.
*/

import java.util.*;

public class ApJavaApplication7_2p {
    public static void main(String[] args) throws Exception {
        CuentaCoriente c;
        c = new CuentaCoriente("12345678-A", "Pepe");
        c.ingreso(1000); // ingresar 1000 euros
        c.egreso(300); // sacando 300 euros se quedan 700 euros
        c.mostrarInformacion(); // mostramos
        System.out.println(" Puedo sacar 700 euros: " + c.egreso(700)); // quedan 0 euros
        System.out.println(" Puedo sacar 500 euros: " + c.egreso(500)); // no es disponible
        // vamos a probar el constructor que utiliza el dni y el saldo
        c = new CuentaCoriente("98765432-Z", 2000); // c referencia al nuevo objeto
        // el anterior queda sin referencia a merced del recolector de basura
        c.mostrarInformacion();

    }
}
