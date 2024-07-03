import java.util.SortedMap;
import java.util.TreeMap;

public class SertedMap {
    public static SortedMap cuentaPalabras(String frase){
        frase = frase.toLowerCase();

        String[] palabras = frase.split(" ");

        SortedMap<String, Integer> frecuenciaPalabras = new TreeMap<>();

        for (String palabra : palabras) {
            if (!frecuenciaPalabras.containsKey(palabra)) {
                frecuenciaPalabras.put(palabra, 1);
            }else{
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.get(palabra) + 1);
            }
        }
        return frecuenciaPalabras;
    }

    public static void main(String[] args) {
        String frase = "El estribillo de una chirigota de Cádiz es Como como como como estoy como estoy";

        SortedMap<String, Integer> resultado = cuentaPalabras(frase);

        // Imprimir el resultado
        System.out.println(resultado);
    }
}
