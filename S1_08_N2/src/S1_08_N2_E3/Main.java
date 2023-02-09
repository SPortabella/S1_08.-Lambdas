package S1_08_N2_E3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crea una Functional Interface que contingui un mètode anomenat operacio().
        // Aquest mètode ha de retornar un float. Injecta a la interfície creada mitjançant una lambda,
        // el cos del mètode, de manera que es pugui transformar l’operació amb una suma,
        // una resta, una multiplicació i una divisió.

        Calculadora calculadora = (number1, number2, operator) -> {
            float resultat = switch (operator) {
                case "+" -> number1 + number2;
                case "-" -> number1 - number2;
                case "*" -> number1 * number2;
                case "/" -> number1 / number2;
                default -> 0;
            };
            return resultat;
        };

        Float valor1 = Float.parseFloat(askUserFloat());
        String operator = askUserOperator();
        Float valor2 = Float.parseFloat(askUserFloat());

        Float result = calculadora.operacio(valor1, valor2, operator);
        System.out.println(valor1 + operator + valor2 + "=" + result);
    }

    private static String askUserOperator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la operació: + - / *");
        String operator = sc.nextLine();
        while (!operator.matches("[+,-,/,*]")) {
            System.out.println("Ha d'introduïr una operació correcta");
            operator = sc.nextLine();
        }
        return operator;
    }

    private static String askUserFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix valor");
        String valor = sc.nextLine();
        while (!valor.matches("[0-9]+")) {
            System.out.println("Error Ha de introduir un valor numéric");
            valor = sc.nextLine();
        }
        return valor;

    }
}
