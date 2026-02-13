package set.conjuntoDeConvidados;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    // Funções
    
    @Override
    public String toString() {
        return "{\n   Nome: " + getNome() + ",\n   Codigo Convite: " + getCodigoConvite() + "\n}";
    }
}
