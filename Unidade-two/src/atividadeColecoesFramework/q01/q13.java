package atividadeColecoesFramework.q01;

import java.util.TreeMap;

public class q13 {
    public static void main(String[] args) {

        TreeMap<String, Integer> pessoas = new TreeMap<>();

        pessoas.put("Rafael", 33);
        pessoas.put("Beatriz", 27);
        pessoas.put("Lucas", 19);
        pessoas.put("Amanda", 45);
        pessoas.put("Gustavo", 22);

        // Imprime os pares em ordem alfabética
        for (String nome : pessoas.keySet()) {
            System.out.println(nome + " - " + pessoas.get(nome));
        }

        // Primeira e última chave
        System.out.println("Primeira chave: " + pessoas.firstKey());
        System.out.println("Última chave: " + pessoas.lastKey());
    }
}
