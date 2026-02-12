package list.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Livro> livros;

    public Catalogo(){
        this.livros = new ArrayList<>();
    }

    // Getters

    public List<Livro> getLivros() {
        return livros;
    }

    // Setters

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    // Funções

    public Boolean adicionarLivro(Livro livro){
        return livros.add(livro);
    }

    public Livro pesquisarPorTitulo(String titulo){
        
        for(Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }

        return null;
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaFiltrada = new ArrayList<>();

        livros.forEach((livro)->{
                if(livro.getAutor().equals(autor)) 
                    listaFiltrada.add(livro);
            }
        );

        return listaFiltrada;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int inicio, int fim){
        List<Livro> listaFiltrada = new ArrayList<>();

        livros.forEach((livro)->{
                if(livro.getAnoDePublicacao() >= inicio && livro.getAnoDePublicacao() <= fim) 
                    listaFiltrada.add(livro);
            }
        );

        return listaFiltrada;
    }
}
