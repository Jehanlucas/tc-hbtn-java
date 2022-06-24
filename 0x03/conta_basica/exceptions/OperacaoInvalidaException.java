package exceptions;

public class OperacaoInvalidaException extends Exception{

    private String mensagem ;


    public OperacaoInvalidaException( String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }
}
