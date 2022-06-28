public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    private produtos.Produto produtos;
    private ItemPedido pedido;
    
    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }


    public void  apresentarResumoPedido() {

        double totalPedido = 0 ;
        double totalDesconto = 0 ;

        System.out.println("------- RESUMO PEDIDO -------" );
        for (ItemPedido pedido : itens) {



            System.out.printf(
                    "Tipo: %s  Titulo: %s  Preco: %,.2f  Quant: %d  Total: %,.2f\n",
                    pedido.getProduto().getClass().getSimpleName(), pedido.getProduto().getTitulo(), pedido.getProduto().getPrecoBruto(), pedido.getQuantidade(),calcularTotal());

            totalDesconto += (percentualDesconto/100)* (pedido.getQuantidade()* pedido.getProduto().obterPrecoLiquido());
            totalPedido += pedido.getQuantidade()*pedido.getProduto().obterPrecoLiquido();
        }


        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %,.2f\n", totalDesconto);
        System.out.printf("TOTAL PRODUTOS: %,.2f\n", totalPedido);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %,.2f\n", calcularTotal());
        System.out.println("----------------------------");


    }

    public double calcularTotal() {
        int contador = 0 ;
        double total = 0;
        for (ItemPedido itens : itens) {
            total += (1.0-percentualDesconto/100)*(itens.getQuantidade()*itens.getProduto().obterPrecoLiquido());
            contador++;
        }
        return total;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
}
