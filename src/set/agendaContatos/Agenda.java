package set.agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> contatos;

    public Agenda(){
        this.contatos = new HashSet<>();
    }

    // Getters

    public Set<Contato> getContatos() {
        return contatos;
    }

    // Setters

    public void setContatos(Set<Contato> contatos) {
        this.contatos = contatos;
    }

    // Funções

    public Boolean adicionarContato(String nome, long telefone){
        return contatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosFiltrados = new HashSet<>();
        
        contatos.forEach((contato)->{
            if(contato.getNome() == nome) contatosFiltrados.add(contato);
        });

        return contatosFiltrados;
    }

    public Boolean atualizarNumeroContato(String nome, long novoNumero){
        if(contatos.removeIf((contato)->{return (contato.getNome() == nome);})){
            contatos.add(new Contato(nome, novoNumero));
            return true;
        }
        return false;
    }
}
