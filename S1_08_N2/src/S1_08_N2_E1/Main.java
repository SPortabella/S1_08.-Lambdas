package S1_08_N2_E1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una llista de totes les cadenes que
        // comencen amb la lletra 'A' (majúscula) i  tenen exactament 3 lletres. Imprimeix el resultat.

        System.out.println("--Exercici 1--");
        List<String> listStr = new ArrayList<>();
        listStr = initList(listStr);

        listStr.stream().filter(l -> l.charAt(0) == 'A' && l.length() == 3).forEach(System.out::println);


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
        list.add("Amanda");
        list.add("Ana");
        list.add("Ava");
        list.add("Ona");
        return list;
    }
}
