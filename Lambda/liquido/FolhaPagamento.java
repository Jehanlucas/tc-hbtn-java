public class FolhaPagamento {

    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario pagamento){
        return pagamento.calcular(funcionario.getSalario());
    }
}
