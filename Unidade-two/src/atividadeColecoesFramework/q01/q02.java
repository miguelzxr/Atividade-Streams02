package atividadeColecoesFramework.q01;

import java.util.ArrayList;
import java.util.List;

public class q02 {
    static void main() {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);

        numeros.remove(3);
        numeros.forEach(n-> System.out.println(n));

    }
}
