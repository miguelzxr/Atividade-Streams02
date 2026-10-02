package atividadeColecoesFramework.q01;

import java.util.HashSet;
import java.util.Set;

public class q08 {
    static void main() {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        System.out.println("esta no conjunto" + numeros.contains(15) + " ");
        System.out.println("nao esta no conjunto" + numeros.contains(18) + " ");

    }
}
