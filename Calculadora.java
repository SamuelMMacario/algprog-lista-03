import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir dois números
        System.out.println("Digite dois números: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Digite a operação que você deseja fazer: ");
        String operacao = input.next();

        double resultado;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println(resultado);
                break;

            case "-":
                resultado = num1 - num2;
                System.out.println(resultado);
                break;

            case "*":
                resultado = num1*num2;
                System.out.println(resultado);
                break;

            case "/":
                resultado = num1 / num2;
                System.out.println(resultado);
                break;

            case "^":
                resultado = 0;
                for (int i = 0; i < num2; i++) {
                    resultado = num1 * num1;
                }
                System.out.println(resultado);
                break;

            default:
                System.out.println("Blergh");
                break;
        }
        System.out.println();

        input.close();
    }

}
