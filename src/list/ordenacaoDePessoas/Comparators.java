package list.ordenacaoDePessoas;

import java.util.Comparator;

public class Comparators {

    public static class ComparatorPorAltura implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa pessoa1, Pessoa pessoa2) {
            return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
        }
    }

    public static class ComparatorPorIdade implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa pessoa1, Pessoa pessoa2) {
            return Integer.compare(pessoa1.getIdade(), pessoa2.getIdade());
        }
    }
}
