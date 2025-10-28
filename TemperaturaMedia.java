import java.util.Scanner;

public class TemperaturaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        double[] temperaturas = new double[12];
        double soma = 0;

        // Entrada de dados
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();
            soma += temperaturas[i];
        }

        double mediaAnual = soma / 12;

        System.out.printf("\nMédia anual das temperaturas: %.2f°C\n", mediaAnual);
        System.out.println("\nMeses com temperatura acima da média:\n");

        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.printf("%s - %.2f°C\n", meses[i], temperaturas[i]);
            }
        }

        sc.close();
    }
}
