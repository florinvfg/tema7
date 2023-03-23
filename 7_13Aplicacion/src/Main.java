import java.util.Scanner;

/*  7.13
En el momento de decorar una casa, una habtacion o cualquier objeto,se platea el problema de eligir la 
paleta de colores que vamos a utilizar en nuestra decoracion.Existe una solucion,algo atrevida,que consiste
en utilizar colores al azar.
Diseña la clase Colores,que alberga por defecto una serie de colores(mediante una cadena),aunque es posible
añadir tantos como necesitemos.La clase tendra un metodo  que devuelve una tabla con los "n" colores que 
necesitemos elegidos al azar sin repeticiones.
 * 
 * 
 */


public class Main {
public  static  void  main ( String [] args )  {
    Colores  color =  new Colores ();
    Scanner sc = new Scanner ( System.in );
    color.añadirColores ( "marron" );
    System.out.print("Cuantos colores quieres:  ");
    int n = sc.nextInt();
    String [] coloresSalon = new  String [ n ];
    coloresSalon = color.getColoresAleatorios(coloresSalon.length);
    for ( int  i = 0 ; i < coloresSalon.length ; i ++) {
        System.out.println( "Colores: " + coloresSalon[ i ]);
    }
    }

}
