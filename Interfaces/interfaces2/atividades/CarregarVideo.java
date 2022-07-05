package interfaces2.atividades;

public class CarregarVideo implements  Atividade{
    @Override
    public void execultar() {

        System.out.println("Carregando video");

    }

    public CarregarVideo() {
        execultar();
    }
}
