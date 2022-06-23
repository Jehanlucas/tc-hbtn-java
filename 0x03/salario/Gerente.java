package Task0;

public class Gerente extends Empregado{

    Empregado empregado ;

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }


    @Override
    public double calcularBonus(Departamento departamento) {

        double meta = 0.01 ;
        double bonus = 0.20;
        double salarioFixo = getSalarioFixo();

        if(departamento.alcancouMeta(departamento.getValorMeta(), departamento.getValorAtingidoMeta())) {
            this.valorBonus = (bonus*salarioFixo) +((departamento.getValorAtingidoMeta()-departamento.getValorMeta())*meta);

        } else {
            this.valorBonus = 0;
        }
        return this.valorBonus;
    }
}
