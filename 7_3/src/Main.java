/*  7.3
Modificar lavisibilidad de la clase CuentaCorriente para que sea visible desde clases
externas y la visibilidad de sus atributos para que:
-saldo no sea visible para otras clases
-nombre sea publico para cualquier clase
-dni solo sea visible por clases vecinas
*/


import java.util.*;




public class Main {
    public static void main(String[] args) throws Exception {
        CuentaCoriente c;
        c = new CuentaCoriente("12345678-A", "Pepe");
        //c.saldo = 2000; //produce un error,ya que el saldo no es visible desde fuera de la clase CuentaCoriente
        c.dni = "11111111-T"; //al ser Main una clase vecina,dni es visible en caso de acceder al dni desde una clase 
        //externa produciria un error
        c.nombre = "Antonio"; //nombre es visible desde cualquier clase
        c.mostrarInformacion();
    }
}
