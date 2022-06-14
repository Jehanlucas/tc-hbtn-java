public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor) {
        this.valor = Integer.valueOf(valor);
    }

    public InteiroPositivo(String valor) {
        this.valor = Integer.parseInt(valor);
    }

    public  boolean ehPrimo(){
            if (valor % 2 == 0 || valor ==1)
                return false;
        return true;
    }

    public int getValor()  throws IllegalArgumentException {
        if(valor < 0 )
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");

        return valor ;
    }

    public void setValor(int valor) throws IllegalArgumentException {
        if(valor < 0 )
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        this.valor = valor ;
    }

}
