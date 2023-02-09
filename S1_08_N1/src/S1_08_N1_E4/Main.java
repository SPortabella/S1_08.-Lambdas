package S1_08_N1_E4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Fer la mateixa impressió del punt anterior,
        //        però mitjançant method reference
        System.out.println("--Exercici 4--");
        List<String> listMonts = new ArrayList<>();
        listMonts = initListMonth(listMonts);
        initListMonth(listMonts).stream().forEach(System.out::println);
    }

    private static List initListMonth(List<String> list) {
        list.add("Gener");
        list.add("Febrer");
        list.add("Març");
        list.add("Abril");
        list.add("Maig");
        list.add("Juny");
        list.add("Juliol");
        list.add("Agost");
        list.add("Setembre");
        list.add("Octubre");
        list.add("Novembre");
        list.add("Desembre");
        return list;
    }
}
