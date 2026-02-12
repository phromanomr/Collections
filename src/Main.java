import java.util.List;

import list.listaDeTarefas.*;


public class Main {
    public static void main(String[] args) {
        var tarefas = new Tarefas();

        tarefas.adicionarTarefa("teste");
        tarefas.adicionarTarefa("teste2");
        tarefas.adicionarTarefa("teste3");
        tarefas.adicionarTarefa("teste4");

        System.out.println(tarefas.totalTarefas());

        tarefas.removerTarefa("teste4");

        System.out.println(tarefas.totalTarefas());

        tarefas.descricaoTarefas();
        
    }

}
