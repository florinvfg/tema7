import java.util.Map;

/* 
     7.14
Crea una clase que sea capaz de mostrar el importe de un cambio,por ejemplo,al realizar una compra,con el 
menor numero de monedas y billetes posible.

 */




public class Main {
    
      
     
        public static void main(String[] args, Object cambio) {
          final double [] billetes = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0,5 };
          final String[] monedas = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
          
          
            double totalCompra = 150.75;
            System.out.println("Total: " + totalCompra);
            double pago = 200.00;
          
            double importe = 0.00;
            int cantidadMonedas = 0;
            int cantidadBilletes = 0;
            int cantidadTotal = 0;
          

            if (cambio instanceof Compra) {
              Compra compra = (Compra) cambio;
              totalCompra = compra.getTotalCompra();
              System.out.println("Total: " + totalCompra);
              pago =compra.getPago();
              System.out.println("Pago: " + pago);

/*
               importe = compra.getImporte();
              monedas = compra.getMonedas();
              billetes = compra.getBilletes();
              cantidadMonedas = compra.getMonedas();
              cantidadBilletes = compra.getBilletes();
              cantidadTotal = compra.getCantidadTotal();
              System.out.println("Total: " + totalCompra);
              
              System.out.println("Importe: " + importe);
              System.out.println("Monedas: " + monedas);
              System.out.println("Billetes: " + billetes);
              System.out.println("Cantidad de monedas: " + cantidadMonedas);
              System.out.println("Cantidad de billetes: " + cantidadBilletes);
              System.out.println("Cantidad total: " + cantidadTotal);
              */

     
            
             
            }
          }
        }
