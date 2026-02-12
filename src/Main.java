import java.util.List;

import list.*;
import list.ordenacaoDePessoas.Povo;


public class Main {
    public static void main(String[] args) {
        Povo povo = new Povo();

        povo.adicionarPessoa("Phelipe", 22, 1.80);
        povo.adicionarPessoa("Phelipe2", 27, 1.78);
        povo.adicionarPessoa("Phelipe3", 12, 1.58);
        povo.adicionarPessoa("Phelipe4", 85, 1.74);
        povo.adicionarPessoa("Phelipe5", 64, 1.76);

        povo.ordenarPorIdade();

        System.out.println(povo.getPessoas());
        
    }

}
