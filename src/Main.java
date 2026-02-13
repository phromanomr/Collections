import list.*;
import list.ordenacaoDePessoas.Povo;
import set.conjuntoDeConvidados.*;
import set.agendaContatos.*;
import set.cadastroProdutos.*;

public class Main {
    public static void main(String[] args) {
        SistemaProdutos sistema = new SistemaProdutos();

        sistema.adicionarProduto("Queijo", 0, 30, 14);
        sistema.adicionarProduto("Pão", 1, 0.20, 72);
        sistema.adicionarProduto("Abacate", 2, 1.30, 19);
        sistema.adicionarProduto("Tomate", 3, 0.3, 35);

        System.out.println(sistema.exibirProdutosPorNome());
        
        System.out.println(sistema.exibirProdutosPorPreco());

    }
}
