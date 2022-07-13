import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Consulta {


    public static List<Produto> obterLivrosDoPedido(Pedido lista){
        List<Produto> produtosPedidos = new ArrayList<Produto>();

        return lista.getProdutos().stream().filter(p-> p.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

    }

    public static Produto obterProdutoMaiorPreco(List<Produto> lista){

        return lista.stream().max(Comparator.comparing(Produto::getPreco)).get();

    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> lista, int precoMinimo){

        return lista.stream().filter(p-> p.getPreco() >= precoMinimo)
                .collect(Collectors.toList());

    }


    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> lista){


        return lista.stream().filter(p-> p.getProdutos().stream().anyMatch(x1->x1.getCategoria().equals(CategoriaProduto.ELETRONICO))).collect(Collectors.toList());

    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> lista){

        lista.forEach(p ->{
            if (p.getCategoria().equals(CategoriaProduto.ELETRONICO)) {double desconto = p.getPreco()-(p.getPreco()*0.15);p.setPreco(desconto);
            }
        });

        return lista;
    }

}
