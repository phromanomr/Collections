package set.agendaContatos;

public class Contato {
    private String nome;
    private long telefone;

    public Contato(String nome, long telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public long getTelefone() {
        return telefone;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    // Funções 
    
    @Override
    public String toString() {
        return "{\n   Nome: " + getNome() + ",\n   Telefone: " + getTelefone() + "\n}";
    }
}
