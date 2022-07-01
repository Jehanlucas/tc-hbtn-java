import java.util.Objects;

public class Autor implements Comparable<Autor>{

    private String nome ;

    private String sobrenome ;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return nome.equals(autor.nome) && sobrenome.equals(autor.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }


    @Override
    public String toString() {
        return nome + sobrenome;
    }


    public int compareTo(Autor autor) {
        int result = this.getNome().compareTo(autor.getNome());

        if(result == 0) {
            return this.getSobrenome().compareTo(autor.getSobrenome());
        }
        return result;
    }
}

