package list.ordenacaoDePessoas;

import java.util.ArrayList;
import java.util.List;

public class Povo {
    private List<Pessoa> pessoas;

    public Povo(){
        pessoas = new ArrayList<>();
    }

    // Getters

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    // Setters

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    // Funções

    public Boolean adicionarPessoa(String nome, int idade, double altura){
        return pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        pessoas.sort(new Comparators.ComparatorPorIdade());
        return pessoas;
    }

    public List<Pessoa> ordenarPorAltura(){
        pessoas.sort(new Comparators.ComparatorPorAltura());
        return pessoas;
    }
}
