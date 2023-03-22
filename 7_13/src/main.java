/* 7.13
Una pila es una estructura dinamica de datos donde los elementos se insertan(se apilan) y se retiran(se despilan)
siguiendo la norma de que el ultimo que se amplia sera el primero en desapilarse,como ocurre con una pila de platos.
Cuando vamos a retirar un plato de una pila a nadie se lo oqurre tirar de uno de los de abajo;retiramos(despilamos) 
el que esta encima de todos,que fue el ultimo en ser apilado.Se llama cima de la pila al ultimo elemento apilado(o al
primer elemento para desapilar).Los metodos fundamentales de una pila so <apilar()> y <desapilar()>.
Implementar la clase Pila para numeros Integer,domde se usa una lista(un objeto de la clase Lista implementada en la 
Actividad resuelta 7.11)para guardar los elementos apilados. 
  */





public class main {
    public static void main(String[] args) throws Exception {
        Pila p = new Pila();
        System.out.println(p.desapilar());
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
            p.mostrar();
    }
    Integer num = p.desapilar();
    while (num !=null) {
        System.out.println(num + " ");
        num = p.desapilar();
    }
}
}
