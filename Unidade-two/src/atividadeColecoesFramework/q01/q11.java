package atividadeColecoesFramework.q01;

import java.util.HashMap;
import java.util.Map;

public class q11 {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.put("João", 30);
        pessoas.put("Maria", 25);
        pessoas.put("Pedro", 41);

        for (Map.Entry<String, Integer> entrada : pessoas.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue() + " anos");
        }
    }
}

