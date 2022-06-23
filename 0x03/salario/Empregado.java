
public class Empregado {
    private double salarioFixo;
    double valorBonus;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {

        double bonus = 0.10;
        double salarioFixo = getSalarioFixo();

        if(departamento.alcancouMeta(departamento.getValorMeta(), departamento.getValorAtingidoMeta())) {
            this.valorBonus = (bonus*salarioFixo);
        } else {
            this.valorBonus = 0;
        }
        return this.valorBonus;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        double bonus = 0.10;
        double salarioFixo = getSalarioFixo();
        double meta = departamento.getValorMeta();
        double valorFinal;

        if(departamento.alcancouMeta(meta, salarioFixo)) {
            valorFinal = calcularBonus(departamento) + salarioFixo;
        } else {
            valorFinal = 0 + salarioFixo;
        }
        return valorFinal;
    }
}
