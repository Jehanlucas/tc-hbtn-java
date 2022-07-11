import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static List<Produto> filtrar (List<Produto> produtos, Predicate<Produto> listar){
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        produtos.forEach(produto -> {
            if(listar.test(produto)) {
                listaProdutos.add(produto);
            }
        });

        return listaProdutos;
    }
}
