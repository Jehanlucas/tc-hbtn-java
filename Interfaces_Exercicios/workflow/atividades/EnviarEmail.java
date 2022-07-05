package atividades;

public class EnviarEmail implements Atividade{


    @Override
    public void execultar() {
        System.out.println("enviando email com video");

    }

    public EnviarEmail() {
        execultar();
    }
}
