
public class CifradoCesar {

    CifradoCesar(){

    }

    public String cifrar(String texto, int n) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isLetter(caracter)) {
                char cifrado = (char) (Character.toUpperCase(caracter) + n - 'A');
                cifrado = (char) ((cifrado % 26) + 'A');
                if (Character.isLowerCase(caracter)) {
                    cifrado = Character.toLowerCase(cifrado);
                }
                resultado += cifrado;
            } else {
                resultado += caracter;
            }
        }
        return resultado;
    }
    
}


