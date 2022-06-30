import java.util.*;

public class Blog {
      List<Post> postagens = new ArrayList<>();
     String categoria;


    public Blog() {
        postagens = new ArrayList<>();
    }


    public  void adicionarPostagem(Post post) {
        postagens.add(post);
    }

    public  Set<String> obterTodosAutores() {
        Set<String> autor = new TreeSet<>();

        for (Post post : postagens) {

            autor.add(post.getAutor());

        }

        return autor;

    }

    public  Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contador = new TreeMap<>();

        int total=0;

        for(int i = 0; i < postagens.size(); i++) {
            for(int j = 0; j < postagens.size() ; j++) {
                if(postagens.get(i).getCategoria().equals(postagens.get(j).getCategoria())) {
                    total++;
                }
            }
            contador.put(postagens.get(i).getCategoria(), total);
            total = 0;
        }
        return contador;
    }
    }
