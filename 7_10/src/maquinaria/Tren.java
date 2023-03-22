package maquinaria;

import personal.Maquinista;

public class Tren {

    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsable;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;
        numVagones = 0;
        vagones = new Vagon[5];
    }

    public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
        if (numVagones >= 5) {
            System.out.println("La maquinaria ya está llena");

        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }
}
