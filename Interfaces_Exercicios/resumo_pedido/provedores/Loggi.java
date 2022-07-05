package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double resultado = 0 ;

        if(peso > 5000){
            resultado =valor * 0.12;
        }else {
            resultado = valor*0.04;
        }
        return new Frete(resultado,obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
