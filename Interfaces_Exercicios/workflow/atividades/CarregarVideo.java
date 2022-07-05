package atividades;

public class CarregarVideo implements  Atividade{
    @Override
    public void execultar() {

        System.out.println("carregando video");

    }

    public CarregarVideo() {
        execultar();
    }
}
