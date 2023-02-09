package S1_08_N1_E7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
        System.out.println("--Exercici 7--");
        List<String> listStr = new ArrayList<>();
        listStr = initList(listStr);
        listStr.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }
    private static List<String> initList(List<String> list) {
        list.add("Joan56");
        list.add("98Albert");
        list.add("Sergi");
        list.add("Sandra");
        list.add("Cristina");
        list.add("123546");
        list.add("Joaquim");
        list.add("Rocío");
        list.add("Enric");
        list.add("Marina");
        list.add("Diego01-05-28");

        return list;
    }
}
