package atividadeColecoesFramework.q01;

import java.util.HashMap;
import java.util.Map;

public class q10 {
    static void main() {

        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("joao", 22);
        pessoas.put("maria", 25);
        pessoas.put("miguel", 28);

        for (Map.Entry<String, Integer> entrada : pessoas.entrySet()) {
            System.out.println("Nome: " + entrada.getKey());
            System.out.println("Idade: " + entrada.getValue());
        }

    }
}
