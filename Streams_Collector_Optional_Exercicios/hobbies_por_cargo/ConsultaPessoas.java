import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoa1) {
        TreeMap<String, TreeSet<Pessoa>> listaAuxiliar = pessoa1.stream()
                .collect(
                        Collectors.groupingBy(
                                Pessoa::getCargo, () -> new TreeMap<>(Comparator.reverseOrder()),
                                Collectors.toCollection(TreeSet::new))
                );
        return listaAuxiliar;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoa1) {
        return pessoa1.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo, Collectors.counting()
                ));

    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoa1) {
        return pessoa1.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade,  Collectors.counting())
                ));

    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoa1) {
        return pessoa1.stream().collect(Collectors.groupingBy(Pessoa::getCargo , Collectors.averagingDouble(Pessoa::getSalario)));
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> pessoa1) {
        return pessoa1.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        Collectors.flatMapping(p -> p.getHobbies().stream(),Collectors.toCollection(TreeSet::new))));

    }
}
