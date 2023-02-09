package S1_08_N1_E2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista
        // amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres.
        // Imprimeix el resultat.
        System.out.println("--Exercici 2--");
        List<String> listStr = new ArrayList<>();
        listStr = initList(listStr);

        List<String> listFilterStrings = selectList(listStr);
        listFilterStrings.forEach(System.out::println);
    }
    private static List<String> selectList(List<String> listStr) {
        return listStr.stream().filter(l -> l.contains("o") && l.length() == 5).toList();
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
