package atividadeColecoesFramework.q01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppPessoaQ1 {
    static void main() {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(20);
        numeros.add(10);
        numeros.add(40);
        numeros.add(30);

        numeros.forEach(n -> System.out.println(n));
        Collections.sort(numeros);
        System.out.println("---------------");
        numeros.forEach(n -> System.out.println(n));
    }
}
