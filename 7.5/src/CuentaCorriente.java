



public class CuentaCorriente {
    private String dni;
    private String nombre;
    private double saldo;
    Gestor gestor;// que administra la cuenta
    //.....resto de la implementacion

    CuentaCorriente (double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        String nobre = null;
        this.nombre = nobre;
    }
    // que administra la cuenta

    CuentaCorriente(String dni, String nombre, Gestor gestor) {// sobrecarga
        this(dni, nombre);
        this.gestor = gestor;

    }
//permite asignar un nuevo objeto Gestor a la cuenta
    void setGestor(Gestor gestor){
        this.gestor = gestor;
    }
    void mostrarInformacion(){ /* muestra el estado de la cuenta,incluido el gestor
                                  No podemos usar directamente "gestor.mostrarInformacion()" 
                                 ya que puede que el gestor sea null.Al intentar acceder
                                 a los miembros de un objeto nulo se produce una exepcion*/
        if (gestor == null) { //si la cuenta no esta administrada por un gestor
            System.out.println(" Cuenta sin gestor ");
        } else {
            System.out.println(" Informacion del gestor ");
        }gestor.mostrarInformacion(); // no es posible mostrar directamente sus 
        System.out.println(" Informacion denla cuenta ");
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Dni: " + dni);
        System.out.println(" Saldo: " + saldo);                           //atributos,ya que algunos no son visible
    }
   

}


    

