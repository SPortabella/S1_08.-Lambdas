package S1_08_N1_E1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes
        // les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.
        System.out.println("--Exercici 1--");

        List<String> listStr = new ArrayList<>();
        listStr = initList(listStr);

        List<String> listFilterStrings = selectList(listStr);
        listFilterStrings.forEach(System.out::println);

    }

    private static List<String> selectList(List<String> listStr) {
        return listStr.stream().filter(l -> l.contains("o")).toList();
    }

    private static List<String> initList(List<String> list) {
        list.add("Joan");
        list.add("Albert");
        list.add("Sergi");
        list.add("Sandra");
        list.add("Cristina");
        list.add("Claudia");
        list.add("Joaquim");
        list.add("Rocío");
        list.add("Enric");
        list.add("Marina");
        list.add("Diego");

        return list;
    }
}
