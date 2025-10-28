import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnaliseNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma nota (-1 para encerrar): ");
            double valor = sc.nextDouble();

            if (valor == -1) {
                break;
            }
            notas.add(valor);
        }

        int quantidade = notas.size();
        System.out.println("\nQuantidade de valores lidos: " + quantidade);
        System.out.println("\nValores informados: " + notas);

        System.out.println("\nValores na ordem inversa:");
        Collections.reverse(notas);
        for (double nota : notas) {
            System.out.println(nota);
        }
        Collections.reverse(notas); // volta à ordem original

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }

        double media = soma / quantidade;

        int acimaMedia = 0;
        int abaixoSete = 0;

        for (double n : notas) {
            if (n > media) {
                acimaMedia++;
            }
            if (n < 7) {
                abaixoSete++;
            }
        }

        System.out.printf("\nSoma dos valores: %.2f\n", soma);
        System.out.printf("Média dos valores: %.2f\n", media);
        System.out.println("Quantidade de notas acima da média: " + acimaMedia);
        System.out.println("Quantidade de notas abaixo de 7: " + abaixoSete);

        System.out.println("\nPrograma encerrado. 👋");

        sc.close();
    }
}
