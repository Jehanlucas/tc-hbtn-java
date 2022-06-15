public class PersonagemGame {
    private int saudeAtual ;
    private String nome ;
    public int tomarDano(int quantidadeDeDano){
        if(quantidadeDeDano >= saudeAtual){
            return  this.saudeAtual = 0;
        }
        if (saudeAtual >0) {
            return saudeAtual -= quantidadeDeDano;
        }
        return quantidadeDeDano;
    }
    public int receberCura(int quantidadeDeCura){

        saudeAtual = quantidadeDeCura+saudeAtual;

        if (saudeAtual >= 100){
            saudeAtual = 100 ;
        }
        return  quantidadeDeCura;

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSaudeAtual() {
        return saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }
}
