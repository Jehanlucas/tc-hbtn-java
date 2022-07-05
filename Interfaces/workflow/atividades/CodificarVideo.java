package interfaces2.atividades;

public class CodificarVideo implements Atividade{


    @Override
    public void execultar() {
        System.out.println("codificando video");

    }

    public CodificarVideo() {
        execultar();
    }
}
