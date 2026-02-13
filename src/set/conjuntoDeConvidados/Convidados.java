package set.conjuntoDeConvidados;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Convidados {
    Set<Convidado> convidados;

    public Convidados(){
        this.convidados = new LinkedHashSet<>();
    }

    // Getters

    public Set<Convidado> getConvidados() {
        return convidados;
    }

    // Setters

    public void setConvidados(Set<Convidado> convidados) {
        this.convidados = convidados;
    }

    // Funções

    public Boolean adicionarConvidado(String nome, int codigoConvite){
        return convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        convidados.removeIf((convidado)->{
            return convidado.getCodigoConvite() == codigoConvite;
        });
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }
}
