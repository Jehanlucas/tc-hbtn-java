package atividades;

public class CodificarVideo implements Atividade{


    @Override
    public void execultar() {
        System.out.println("codificando video");

    }

    public CodificarVideo() {
        execultar();
    }
}
