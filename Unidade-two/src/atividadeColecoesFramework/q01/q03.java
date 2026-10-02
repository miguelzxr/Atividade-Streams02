package atividadeColecoesFramework.q01;

import Colecoes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class q03 {

        public class Main {
            public static void main(String[] args) {
                ArrayList<String> frutas = new ArrayList<>();

                frutas.add("maçã");
                frutas.add("banana");
                frutas.add("laranja");
                frutas.add("abacaxi");

                int indiceBanana = frutas.indexOf("banana");

                if (indiceBanana != -1) {
                    System.out.println("\"banana\" encontrada no índice " + indiceBanana);
                }

                int indiceUva = frutas.indexOf("uva");

                if (indiceUva == -1) {
                    System.out.println("\"uva\" não foi encontrada");
                }
            }
        }


    }

