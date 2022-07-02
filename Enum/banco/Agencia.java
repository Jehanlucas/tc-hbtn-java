

import java.util.ArrayList;
public class Agencia {

    String nome ;

    ArrayList<Cliente> clientes ;

    public Agencia(String nome) {
        this.nome = nome;
        clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }


    public boolean novoCliente(String nome, double valorTransacao){
       Cliente resultado =  buscarCliente(nome);

       if (resultado == null){
           Cliente n1 = new Cliente(nome , valorTransacao);
           clientes.add(n1);
           return true ;
       }

        return false;
    }


    public boolean adicionarTransacaoCliente(String nome, double transacao){
        Cliente resultado =  buscarCliente(nome);

        if (resultado != null){
            resultado.adicionarTransacao(transacao);
            return true ;
        }

        return false;


    }


    public Cliente buscarCliente(String nomeCliente){
        for (Cliente nome: clientes) {
            if (nome.getNome().equals(nomeCliente)){
                return nome ;
            }

        }
        return null;
    }
}
