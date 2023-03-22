package maquinaria;

public class Vagon {
    int numIdetificativo;
    int cargaMax;
    int cargaActual;
    String mercancia;
    public Vagon(int numIdetificativo, int cargaMax, int cargaActual, String mercancia) {
        this.numIdetificativo = numIdetificativo;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    } 
}
