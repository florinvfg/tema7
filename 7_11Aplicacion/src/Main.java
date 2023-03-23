/*  
7.11
Escribir la clase MarcaPagina,que ayuda a llevar el control de la lectura de un libro.Debera
disponer de metodos para incrementar la pagina leida,para obtener imformacion de la ultima 
pagina que se ha leido y para comenzar desde el principio una nueva lectura del mismo libro.

 * 
 * 
 */



public class Main {
    public static void main(String[] args) throws Exception {
        MarcaPagina marcaPagina = new MarcaPagina(0, 150);
    
        // Comenzar una nueva lectura
        marcaPagina.comenzarNuevaLectura();
        
        // Leer las primeras 10 páginas
        for (int i = 0; i < 10; i++) {
            marcaPagina.incrementarPagina();
        }
        
        // Marcar la última página leída
        marcaPagina.marcarUltimaPaginaLeida();
        
        // Leer otras 5 páginas
        for (int i = 0; i < 5; i++) {
            marcaPagina.incrementarPagina();
        }
        
        // Obtener la última página leída
        int ultimaPaginaLeida = marcaPagina.getUltimaPaginaLeida();
        System.out.println("Última página leída: " + ultimaPaginaLeida);
    }
    }

