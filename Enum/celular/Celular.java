

import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> telefone ;

    public Celular() {
        this.telefone = new ArrayList<>();
    }

    public  int obterPosicaoContato(String nomeContato){
        for (Contato nome: telefone ) {
            if (nome.getNome().equals(nomeContato)){
                return telefone.indexOf(nome) ;
            }
        }
        return -1;
    }



    public  void adicionarContato(Contato contato) {
        int aux = obterPosicaoContato(contato.getNome());
        if(aux != -1){
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }else {
            telefone.add(contato);
        }
    }



    public  void atualizarContato(Contato contatoAntigo, Contato novoContato){
        int i = obterPosicaoContato(contatoAntigo.getNome());
        int j = obterPosicaoContato(novoContato.getNome());


         if (i < 0 ){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if (j!= -1 && j != i){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

         telefone.set(i,novoContato);
    }

    public  void removerContato(Contato contato) {
        int i = obterPosicaoContato(contato.getNome());
        if(i != -1){
            telefone.remove(i);
        }else
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
    }

    public void listarContatos(){
        for (Contato lista : telefone){
             System.out.println(lista.getNome()+" -> "+ lista.getNumero() +" ("+lista.getTipo()+")");
        }
    }


}
