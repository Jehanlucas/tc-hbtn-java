public class PersonagemGame {
    private int saudeAtual ;
    private String nome ;

    private String status ;

    public void tomarDano(int quantidadeDeDano){


        if(quantidadeDeDano >= this.saudeAtual){
            setSaudeAtual(saudeAtual = 0);
        }
        if (saudeAtual >0) {

             setSaudeAtual(saudeAtual -= quantidadeDeDano);
        }


    }

    public int receberCura(int quantidadeDeCura){


        setSaudeAtual(saudeAtual += quantidadeDeCura);
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

        if (saudeAtual >0 ){
            this.status = "vivo" ;
        }
        if (saudeAtual <= 0){
            this.status = "morto";
        }
    }

    public String getStatus() {
        return status;
    }
}
