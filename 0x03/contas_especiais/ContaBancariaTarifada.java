import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;
    private  double tarifaTransacao = 0.10;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }else{
            saldo += valor - (tarifaTransacao);
        }
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor < 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }else if(saldo < valor){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }else
            saldo = saldo - valor - (tarifaTransacao);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
