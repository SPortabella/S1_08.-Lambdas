package S1_08_N1_E5;

public class Main {
    public static void main(String[] args) {
        //Crea una Functional Interface amb un mètode anomenat getPiValue()
        // que ha de retornar un double. Des del main() de la classe principal,
        // instància la interfície i assigna-li el valor 3.1415.
        // Invoca el mètode getPiValue() i imprimeix el resultat
        System.out.println("--Exercici 5--");
        PiValue valorPi = () -> 3.1415;
        System.out.println("El valor de Pi es: " + valorPi.getPiValue());
    }
}
