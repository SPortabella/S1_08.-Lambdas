package S1_08_N2_E2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers.
        // Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o”
        // si el nombre és imparell. Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser
        // “o3, o55, e44”. Imprimeix el resultat.

        List<Integer> listInteger = new ArrayList<>();
        listInteger = initIntegerList(listInteger);

        StringBuilder result = resultString(listInteger);
        System.out.println(result);

    }

    private static StringBuilder resultString(List<Integer> listInteger) {
        List<String> listString = new ArrayList<>();
        StringBuilder result = new StringBuilder("");
        listInteger.forEach(integer -> {
            if (integer % 2 == 0) result.append("e" + integer + ",");
            else result.append("o" + integer + ",");
        });
        return result.deleteCharAt(result.length() - 1);
    }

    private static List<Integer> initIntegerList(List list) {
        //List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(44);
        list.add(32);
        list.add(33);
        list.add(87);
        list.add(98);
        list.add(2);
        list.add(0);
        return list;
    }
}
