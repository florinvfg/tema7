/*7.1 Resuelta

Diseñar un aclase < CuentaCoriente >,que almacena los datos:DNI y nombre del titular,
asi como el saldo.Las operaciones tipicas con una cuenta coriente son:
- Crear una cuenta:se necesita el DNI y nombre de titular.El saldo inicial sera "0"
- Sacar dinero:el metodo debe iniciar si ha sido posible llevar a cabo la operacion,
si existe saldo suficiente
- Ingresar dinero:se incrementa el saldo
-Mostrar informacion:muestra la informacion disponible de la cuenta corriente
*/

package Ejercicio7_1;

import java.util.*;

class CuentaCorrientePrincipal {
       public static void main(String[] args) {
              CuentaCorriente c;
              c = new CuentaCorriente("12345678A", "Pepe"); // cuenta de Pepe con DNI 12.345.678-A
              c = new CuentaCorriente("87654321A", "Paco"); // cuenta de Pepe con DNI 87.654.321-A
              c.ingreso(1000); // ingresar 1000 euros
              c.egreso(300); // sacando 300 euros se quedan 700 euros
              c.mostrarInformacion(); // mostramos
              System.out.println(" Puedo sacar 700 euros: " + c.egreso(700)); // quedan 0 euros
              System.out.println(" Puedo sacar 500 euros: " + c.egreso(500)); // no es disponible

       }
}
