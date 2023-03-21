/* 7.6
Escribir un programa que lea por teclado una hora cualquiera y un numero n que representa una
cantidad en segundos.El programa mostrara la hora introducida y las n siguientes,que se 
diferencian en un segundo.Para ello hemos de diseñar previamente la clase HORA que dispone de
 los atributos hora,minuto y segundos.Los valores de los atributos se controlaran mediante metodos
 set/get.
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;

 public class App {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      HORA h = new HORA();
      System.out.println("Ingrese la hora: ");
      int valor = sc.nextInt();
      h.setHora (valor);
      System.out.println("Ingrese el minuto: ");
      valor = sc.nextInt();
      h.setMinuto (valor);
      System.out.println("Ingrese el segundo: ");
      valor = sc.nextInt();
      h.setSegundo(valor);
      System.out.println(" Cuantos segundos quieres mostrar: ");
      int numSegundos = sc.nextInt();
      for (int i = 0; i < numSegundos; i++) {
      System.out.println("La hora introducida es: "+h.getHora()+ ":" +h.getMinuto()+ ":" +h.getSegundo());
      h.incrementaSegundo();
     
    }
}
}
