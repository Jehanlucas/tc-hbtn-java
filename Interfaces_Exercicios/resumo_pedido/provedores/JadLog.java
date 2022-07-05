package provedores;

public class JadLog implements  ProvedorFrete {




    @Override
    public Frete calcularFrete(double peso, double valor) {
        double resultado = 0 ;

        if(peso > 2000){
            resultado =valor * 0.07 ;
        }else {
            resultado =valor*0.045;
        }
        return new Frete(resultado,obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG ;
    }
}
