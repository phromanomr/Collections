package list.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    private List<Tarefa> tarefas;

    public Tarefas(){   
        this.tarefas = new ArrayList<>();
    }

    // Getters

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    // Setters

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    // Funções
    
    public Boolean adicionarTarefa(String descricao){
        return tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaAtualizada = new ArrayList<>();

        for(Tarefa tarefa : tarefas){
            if(!tarefa.getTarefa().equals(descricao)){
                listaAtualizada.add(tarefa);
            }
        }

        this.tarefas = listaAtualizada;
    }

    public int totalTarefas(){
        return tarefas.size();
    }

    public void descricaoTarefas(){
        //tarefas.forEach((tarefa)->System.out.println(tarefa.getTarefa()));
        System.out.println(tarefas.toString());
    }

    

    
}
