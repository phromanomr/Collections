package set.cadastroProdutos;

import java.util.Comparator;

public class Comparators {
    public static class OrdenarPorNome implements Comparator<Produto> {
        @Override
        public int compare(Produto produto1, Produto produto2) {
            return produto1.getNome().compareTo(produto2.getNome());
        }
    }

    public static class OrdenarPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto produto1, Produto produto2) {
            return Double.compare(produto1.getPreco(), produto2.getPreco());
        }
    }
}
