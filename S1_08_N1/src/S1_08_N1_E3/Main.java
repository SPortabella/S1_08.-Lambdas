package S1_08_N1_E3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista
        // amb una lambda.
        System.out.println("--Exercici 3--");
        List<String> listMonts = new ArrayList<>();
        listMonts = initListMonth(listMonts);
        initListMonth(listMonts).stream().forEach(l-> System.out.println(l));
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
