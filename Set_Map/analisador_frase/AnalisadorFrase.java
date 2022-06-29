
import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer > contagemPalavras(String frase) {
        TreeMap<String, Integer> lista = new TreeMap<>();

        String[] texto = frase.split(" ");

        for (String palavra: texto) {
            palavra = palavra.replaceAll("[?!.]", "").toLowerCase(Locale.ROOT);

            if(lista.containsKey(palavra)) {
                int contador = lista.get(palavra);
                contador++;
                lista.put(palavra, contador);
            } else {
                int contador =1 ;
                lista.put(palavra, contador);
            }
        }

        return lista;
    }
}

