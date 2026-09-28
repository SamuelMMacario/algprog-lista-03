import java.util.Scanner;

public class CalculaTroco {
    public static void main(String[] args) {
        System.out.println("Algoritmo para calcular troco.");
        Scanner input = new Scanner(System.in);

        // Recebe o valor da compra
        System.out.println("Informe o valor da compra: ");
        double valorCompra = input.nextDouble();

        System.out.println("Informe o valor pago: ");
        double valorPago = input.nextDouble();

        if (valorPago >= valorCompra) {

            double saldoPositivo = valorPago - valorCompra;

            // É feio mas funciona >.<
            if (valorPago >= 50) {
                double trocoNotas50 = (int) saldoPositivo / 50;
                System.out.println("Total de notas de 50 de troco: " + trocoNotas50 + ".");
                saldoPositivo = saldoPositivo % 50;
            }
            if (valorPago >= 20) {
                double trocoNotas20 = (int) saldoPositivo / 20;
                System.out.println("Total de notas de 20 de troco: " + trocoNotas20 + ".");
                saldoPositivo = saldoPositivo % 20;
            }
            if (valorPago >= 10) {
                double trocoNotas10 = (int) saldoPositivo / 10;
                System.out.println("Total de notas de 10 de troco: " + trocoNotas10 + ".");
                saldoPositivo = saldoPositivo % 10;
            }
            if (valorPago >= 5) {
                double trocoNotas5 = (int) saldoPositivo / 5;
                System.out.println("Total de notas de 5 de troco: " + trocoNotas5 + ".");
                saldoPositivo = saldoPositivo % 5;
            }
            if (valorPago >= 2) {
                double trocoNotas2 = (int) saldoPositivo / 2;
                System.out.println("Total de notas de 2 de troco: " + trocoNotas2 + ".");
                saldoPositivo = saldoPositivo % 2;
            }
            System.out.println("Não foi possível devolver o restante de troco, portanto, foi adicionado como saldo a sua conta: "+saldoPositivo);
        } else {
            System.out.println("Saldo inválido.");
        }

        input.close();
    }
}