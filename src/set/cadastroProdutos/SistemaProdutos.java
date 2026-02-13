package set.cadastroProdutos;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SistemaProdutos {
    Set<Produto> sistema;

    public SistemaProdutos(){
        this.sistema = new LinkedHashSet<>();
    }

    // Getters

    public Set<Produto> getSistema() {
        return sistema;
    }

    // Setters

    public void setSistema(Set<Produto> sistema) {
        this.sistema = sistema;
    }

    // Funções

    public Boolean adicionarProduto(String nome, int codigo, double preco, int quantidade){
        return this.sistema.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosOrdenados = new TreeSet<>(new Comparators.OrdenarPorNome());
        produtosOrdenados.addAll(sistema);
        return produtosOrdenados;
    }
    
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosOrdenados = new TreeSet<>(new Comparators.OrdenarPorPreco());
        produtosOrdenados.addAll(sistema);
        return produtosOrdenados;
    }
}
