import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente() {

    }

    public Cliente(String nome, double transacao) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
    }


    public void adicionarTransacao(double valorDaTransacao) {
        transacoes.add(valorDaTransacao);
    }


    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }
}
