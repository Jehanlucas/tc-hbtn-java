import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome ;
    private double preco ;

    private double  percentualMarkUp ;

    public Produto(Double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 0.1;

    }

    Supplier<Double> precoComMarkup = () -> preco*(1+percentualMarkUp);
    Consumer<Double> atualizarMarkup = valor ->  this.percentualMarkUp =(valor/100);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkUp() {
        return percentualMarkUp;
    }

    public void setPercentualMarkUp(double percentualMarkUp) {
        this.percentualMarkUp = percentualMarkUp;
    }

    public Supplier<Double> getPrecoComMarkup() {
        return precoComMarkup;
    }

    public void setPrecoComMarkup(Supplier<Double> precoComMarkup) {
        this.precoComMarkup = precoComMarkup;
    }

    public Consumer<Double> getAtualizarMarkup() {
        return atualizarMarkup;
    }

    public void setAtualizarMarkup(Consumer<Double> atualizarMarkup) {
        this.atualizarMarkup = atualizarMarkup;
    }
}
