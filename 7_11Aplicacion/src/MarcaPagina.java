
public class MarcaPagina {
    private int paginaActual;
    private int ultimaPaginaLeida;
    
    public MarcaPagina() {
        this.paginaActual = 0;
        this.ultimaPaginaLeida = 0;
    }
    
    public MarcaPagina(int i, int j) {
    }

    public void incrementarPagina() {
        this.paginaActual++;
    }
    
    public int getUltimaPaginaLeida() {
        return this.ultimaPaginaLeida;
    }
    
    public void comenzarNuevaLectura() {
        this.paginaActual = 0;
        this.ultimaPaginaLeida = 0;
    }
    
    public void marcarUltimaPaginaLeida() {
        this.ultimaPaginaLeida = this.paginaActual;
    }

}
