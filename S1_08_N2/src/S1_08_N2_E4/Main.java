package S1_08_N2_E4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Crea una llista que contingui algunes cadenes de text i nombres.
        Ordena-les per:
        Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer caràcter)
        Les cadenes que contenen una "e" primer, la resta de cadenes després.
        Posa el codi directament a la lambda.
        Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
        Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).
         */
        System.out.println("--Exercici 4--");

        List<String> listStr = new ArrayList<>();
        listStr = initList(listStr);
        listStr.stream().sorted((Comparator.comparingInt(str -> str.charAt(0)))).forEach(System.out::println);

        System.out.println("--------");

        listStr.stream().sorted((str1, str2) -> {
            String char1= String.valueOf(str1.charAt(0));
            String char2 = String.valueOf(str2.charAt(0));

            if((char1.equals("e") && !char2.equals("e"))) return -1;
            if((!char1.equals("e") && char2.equals("e"))) return 1;
            return str1.compareTo(str2);
                }).forEach(System.out::println);

        System.out.println("--------");

        listStr.replaceAll(str-> str.replace("a", "4"));
        listStr.stream().forEach(System.out::println);

        System.out.println("--------");
        listStr.stream().filter(str -> str.matches("[0-9]+")).forEach(System.out::println);
    }

    private static List<String> initList(List<String> list) {
        list.add("Gener");
        list.add("4678");
        list.add("eebrer02-2023n");
        list.add("Març2023");
        list.add("02-12-23 Desembre");
        list.add("Tres d'octubre de 2023");
        list.add("e1112023");
        list.add("abril");
        list.add("Mayo");
        return list;
    }
}
