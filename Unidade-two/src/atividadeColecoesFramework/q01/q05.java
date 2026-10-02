package atividadeColecoesFramework.q01;

import java.util.LinkedList;

public class q05 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.addFirst(0);
        numeros.addLast(6);

        System.out.println("Lista: " + numeros);
        System.out.println("Primeiro elemento: " + numeros.getFirst());
        System.out.println("Último elemento: " + numeros.getLast());
    }
}

