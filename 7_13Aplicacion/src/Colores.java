import java.util.Arrays;

public class Colores {
    String[] colores = {"azul", "rojo", "verde", "amarillo", "naranja", "gris", "blanco", "negro"};

    Colores() {

    }

    public void añadirColores(String nuevoColor) {
        colores = Arrays.copyOf(colores, colores.length + 1);
        colores[colores.length - 1] = nuevoColor;
    }

    public String[] getColoresAleatorios(int length) {
        String[] coloresAleatorios = new String[length];
        for (int i = 0; i < coloresAleatorios.length; i++) {
            coloresAleatorios[i] = colores[(int) (Math.random() * colores.length)];
        }
        return coloresAleatorios;
  }
}


