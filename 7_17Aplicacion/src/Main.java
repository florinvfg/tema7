/*  7.17
El cifrado Cesar es una forma sensilla de modificar un texto para que no sea entendible a quienes no conoce 
el codigo.Este cifrado consiste en modificar cada letra de un texto por otra que se encuentra en el alfabeto
 n posiciones detras.Por ejemplo,para un valor de n igual a 3,la letra a se codifica con la d,y la letra q se
  codifica con la x.En el casa de que una letra exeda a la z,seguiremos de forma circular utilizando la a.Solo
   se cifraran las letras,mayusculas o minusculas.Realiza una clase que, mediante un metodo estatico,devuelva 
   cifrado el texto que se le pasa con un paso de n letras.

 */

public class Main {
    public static void main(String[] args) throws Exception {
        CifradoCesar cesar = new CifradoCesar();
        String texto = "Somos personas de la comunidad";
        int n = 3;
        String textoCifrado = cesar.cifrar(texto, n);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto cifrado: " + textoCifrado);
    }

    
/* 
    private static String cifrar(String texto, int n) {

        String cifrado = "";
        for (int i = 0; i < texto.length(); i++) {  
            if (i % n == 0) {
                cifrado += texto.charAt(i);
            }
        }
        return cifrado;
    }*/

}
