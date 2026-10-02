package atividadeColecoesFramework.q01;

import Colecoes.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class q07 {
    static void main() {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);

        numeros.forEach(n-> System.out.println(numeros.size() + 1));
        System.out.println("Retorno de add(10): " + numeros.add(10));

    }



}
