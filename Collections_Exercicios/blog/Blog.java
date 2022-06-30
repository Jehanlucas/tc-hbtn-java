
import java.util.*;

public class Blog {
    private static List<Post> postagem = new ArrayList<>();
    public static String categoria;



    public static void adicionarPostagem(Post post) {
        postagem.add(post);
    }

    public static Set<String> obterTodosAutores() {
        Set<String> autor = new HashSet<>();

        for (Post post : postagem) {

            autor.add(post.getAutor());

        }

        return autor;

    }

    public static Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contador = new TreeMap<>();

        int total=0;

        for(int i = 0; i < postagem.size(); i++) {
            for(int j = 0; j < postagem.size() ; j++) {
                if(postagem.get(i).getCategoria().equals(postagem.get(j).getCategoria())) {
                    total++;
                }
            }
            contador.put(postagem.get(i).getCategoria(), total);
            total = 0;
        }
        return contador;
    }
    }
