import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar (List<Produto> produtos, CriterioFiltro filtrar){
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        produtos.forEach(produto -> {
            if(filtrar.testar(produto)) {
                listaProdutos.add(produto);
            }
        });

        return listaProdutos;
    }
}
