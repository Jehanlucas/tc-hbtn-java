

public class Livro {

    private String titulo ;
    private String autor ;
    private  double preco ;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {

            if (titulo.length()>=1){
                this.titulo = titulo;
            }else {

                throw new LivroInvalidoException("Titulo de livro invalido");
            }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {

            if (autor.length() >= 9) {
                this.autor = autor;
            }else {

                throw new AutorInvalidoException("Nome do autor invalido");
            }
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {

            if (preco > 0) {
                this.preco = preco;

            }

            else{
            throw new  LivroInvalidoException("Titulo de livro invalido");

        }

    }
}
