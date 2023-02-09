package S1_08_N1_E8;

public class Main {
    public static void main(String[] args) {
        //Crea una Functional Interface que contingui un mètode anomenat reverse().
        // Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal,
        // injecta a la interfície creada mitjançant una lambda,
        // el cos del mètode, de manera que torni la mateixa cadena
        // que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova
        // si el resultat és correcte.
        System.out.println("--Exercici 8--");
        IReverse iReverse = (String cadena) -> new StringBuilder(cadena).reverse().toString();
        String prueba = "prueba de ejercicio nº 8";
        System.out.println(prueba);
        String pruebaReverse = iReverse.reverse(prueba);
        System.out.println(pruebaReverse);
        if (prueba.equals(iReverse.reverse(pruebaReverse)))
            System.out.println("Resultat correcte");
        //System.out.println(checkStrings(prueba, pruebaReverse));
    }
    private static Boolean checkStrings(String prueba, String pruebaReverse) {

        String invertida = "";
        // leemos la cadena al reves
        for (int i = prueba.length() - 1;
             i >= 0; i--) {
            // y los concatenamos en una nueva cadena
            invertida += prueba.charAt(i);
        }
        if (pruebaReverse.equals(invertida)) return true;
        else return false;
    }
}
