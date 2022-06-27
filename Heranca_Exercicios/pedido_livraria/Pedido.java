

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;


    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido itens : itens) {
            total += (1.0-percentualDesconto/100)*(itens.getQuantidade()*itens.getProduto().obterPrecoLiquido());
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
