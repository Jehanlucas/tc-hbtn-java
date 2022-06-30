
import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap<String, ArrayList<Telefone>> telefones ;



    public ListaTelefonica(){
        telefones = new HashMap<>();
    }


    public void adicionarTelefone(String nome, Telefone novoTelefone){
        ArrayList<Telefone> lista = telefones.get(nome);

        if (lista == null){
            lista = new ArrayList<Telefone>();
        }

        lista.add(novoTelefone);

        telefones.put(nome,lista);



    }

    public ArrayList<Telefone> buscar(String nome) {
        return telefones.get(nome);
    }
}
