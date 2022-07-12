import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {


    public static List<Produto> obterLivrosDoPedido(Pedido lista){
        List<Produto> produtosPedidos =  new ArrayList<Produto>(lista.getProdutos());

        return lista.getProdutos().stream().filter(p-> p.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

    }
}
