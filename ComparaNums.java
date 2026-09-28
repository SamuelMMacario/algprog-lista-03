import java.util.Scanner;

public class ComparaNums {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Algoritmo para fazer comparação de valores.");
        System.out.println("Digite três números inteiros para serem comparados: ");
        int numA, numB, numC;
        double media;
        numA = input.nextInt();
        numB = input.nextInt();
        numC = input.nextInt();

        media = (numA + numB + numC)/3;
        // Re-escrevendo tudo porque eu não sei ler a questão

        // Comparador maior número
        if (numA > numB && numA > numC) {
            System.out.println(numA + " é o maior número");
        } else if (numB > numC) {
            System.out.println(numB + " é o maior número");
        } else {
            System.out.println(numC + " é o maior número");
        }

        // Comparador menor número
        if (numA < numB && numA < numC) {
            System.out.println(numA + " é o menor número");
        } else if (numB < numC) {
            System.out.println(numB + " é o menor número");
        } else {
            System.out.println(numC + " é o menor número");
        }

        System.out.println("A média dos números é " + media);
        input.close();
    }
}
