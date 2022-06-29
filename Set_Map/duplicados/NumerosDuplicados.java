
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {


    public static TreeSet<Integer> buscar(int[] lista){
        TreeSet<Integer> Set = new TreeSet<>();
        HashSet<Integer> listaIntteiros = new HashSet<>();



        for (int numeros : lista) {
            if (!listaIntteiros.add(numeros)){
            Set.add(numeros);}
        }



        return Set ;




    }
}
