package atividadeColecoesFramework.q01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class q09 {
    static void main() {

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(10);
        numeros.add(40);
        numeros.add(20);
        numeros.add(30);

        System.out.println("conjunto" + numeros);
        System.out.println("maior" + numeros.last());
        System.out.println("maior" + numeros.last());
    }
}
