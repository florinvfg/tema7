

class Main {
    public static void main(String[] args) {
       
       
        CuentaCoriente c;
        c = new CuentaCoriente("12345678-A", "Pepe");
        c.ingreso(1000); 
        c.egreso(300); 
        c.mostrarInformacion(); //mostramos
        System.out.println(" Puedo sacar 700 euros: " + c.egreso(700)); // quedan 0 euros
        System.out.println(" Puedo sacar 500 euros: " + c.egreso(500)); //no es disponible
    //vamos a probar el constructor que utiliza el dni y el saldo
    c = new CuentaCoriente("98765432-Z", 2000); //c referencia al nuevo objeto
    //el anterior queda sin referencia a merced del recolector de basura
    c.mostrarInformacion();    
    }

}