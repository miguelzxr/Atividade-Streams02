package atividadeColecoesFramework.q01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class q06 {
    static void main() {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("miguel", 19, "999888777"));
        pessoas.add(new Pessoa("piedade", 22, "999888777"));
        pessoas.add(new Pessoa("marcondes ", 24, "999888777"));
        pessoas.add(new Pessoa("raimundo ", 25, "999888777"));

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));

        System.out.println("idade");

        for (Pessoa p : pessoas){
            System.out.println(p);
        }

        pessoas.sort(Comparator.comparing(Pessoa::getName));

        System.out.println("por nome");
        for (Pessoa p : pessoas){
            System.out.println(p);
        }

    }
}
