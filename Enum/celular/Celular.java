import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contatos;

    public Celular() {
        contatos = new ArrayList<>();
    }

    public  int obterPosicaoContato(String nomeContato){
        for (Contato nome: contatos) {
            if (nome.getNome().equals(nomeContato)){
                return contatos.indexOf(nome) ;
            }
        }
        return -1;
    }



    public  void adicionarContato(Contato contato) {
        int aux = obterPosicaoContato(contato.getNome());
        if(aux != -1){
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }else {
            contatos.add(contato);
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

         contatos.set(i,novoContato);
    }

    public  void removerContato(Contato contato) {
        int i = obterPosicaoContato(contato.getNome());
        if(i != -1){
            contatos.remove(i);
        }else
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
    }

    public void listarContatos(){
        for (Contato lista : contatos){
             System.out.println(lista.getNome()+" -> "+ lista.getNumero() +" ("+lista.getTipo()+")");
        }
    }


}
