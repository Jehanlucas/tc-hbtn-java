package atividades;

public class ModificarStatusVideo implements Atividade{
    @Override
    public void execultar() {
        System.out.println("modificando status do video");


    }

    public ModificarStatusVideo() {
        execultar();
    }
}
