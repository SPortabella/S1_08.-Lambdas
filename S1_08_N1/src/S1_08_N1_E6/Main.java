package S1_08_N1_E6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta
        // a més llarga.
        System.out.println("--Exercici 6--");
        List<String> listStr = new ArrayList<>();
        listStr = initList(listStr);
        listStr.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
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
