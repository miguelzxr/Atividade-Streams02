package atividadeColecoesFramework.q01;

import java.util.HashMap;
import java.util.Map;

public class q12 {
    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("João", 20);
        pessoas.put("Maria", 25);
        pessoas.put("Pedro", 30);


        System.out.println("Idade de João: " + pessoas.get("João"));


        if (pessoas.containsKey("Ana")) {
            System.out.println("Idade de Ana: " + pessoas.get("Ana"));
        } else {
            System.out.println("Ana não está no mapa.");
        }


        int idadeAna = pessoas.getOrDefault("Ana", 0);
        System.out.println("Idade de Ana: " + idadeAna);
    }
}