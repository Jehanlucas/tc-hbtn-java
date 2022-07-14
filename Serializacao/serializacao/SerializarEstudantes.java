import java.io.*;
import java.util.List;

public class SerializarEstudantes<E> {
    FileOutputStream arquivo = null ;
    ObjectOutputStream obj = null ;

    private String nomeArquivo ;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }



    public void serializar(List<Estudante> estudantes) {
        try {
            arquivo = new FileOutputStream(nomeArquivo);
            obj = new ObjectOutputStream(arquivo);
            obj.writeObject(estudantes);
        }
        catch (Exception e){
            throw new IllegalArgumentException("Nao foi possivel serializa");
        }
        finally {
            if (obj != null){
                try {
                    obj.close();
                } catch (IOException e) {
                    throw new RuntimeException("Nao foi possivel serializa");
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante>estudantes = null ;
        FileInputStream arquivo = null ;
        ObjectInputStream obj = null ;
        try {
            arquivo = new FileInputStream(nomeArquivo);
            obj = new ObjectInputStream(arquivo);
            estudantes = (List<Estudante>)obj.readObject();


        } catch (Exception e){
            System.out.println("Nao foi possivel desserializar");
        }
        finally {
            if (obj != null){
                try {
                    obj.close();
                } catch (IOException e) {
                    throw new RuntimeException("Nao foi possivel desserializar");
                }
            }
        }

        return estudantes;
    }
}
