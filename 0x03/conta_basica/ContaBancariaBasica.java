import exceptions.OperacaoInvalidaException;

{

    private String numeracao ;

    private double saldo = 0;

    private double tarifa = 10.00;

    private double taxaJurosAnual ;


    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor>0){
            saldo += valor ;
        }
        else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor>0 && saldo >= valor){
            saldo -= valor ;
        }
        else if (valor< 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
    }


    public double calcularTarifaMensal() {
        double tarifaFinal;
        double tarifa = 0.10*this.saldo;
        if (tarifa<10) {
            double tarifaMensal = 0.10*this.saldo;
            tarifaFinal = tarifaMensal;
        } else {
            tarifaFinal =10;
        }
        return tarifaFinal;
    }

    public double calcularJurosMensal() {
        double juros = this.getTaxaJurosAnual();
        if (this.saldo<=0) {
            juros=0;
        }
        return ((juros / 12)*this.saldo)/100;
    }

    public  double aplicarAtualizacaoMensal(){
        return this.saldo = (this.saldo-calcularTarifaMensal())+calcularJurosMensal();
    }


}

