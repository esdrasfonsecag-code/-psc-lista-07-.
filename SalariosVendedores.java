import java.util.Scanner;

public class SalariosVendedores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] faixas = new int[9]; // 200–299 até 1000+
        double vendas, salario;

        while (true) {
            System.out.print("Digite o valor das vendas brutas do vendedor (-1 para encerrar): ");
            vendas = sc.nextDouble();

            if (vendas == -1) break;

            salario = 200 + (vendas * 0.09);
            int indice = (int) ((salario - 200) / 100);

            if (indice >= 8) {
                indice = 8; // Faixa acima de 1000
            }

            faixas[indice]++;
        }

        String[] intervalos = {
            "$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599",
            "$600 - $699", "$700 - $799", "$800 - $899", "$900 - $999", "$1000 em diante"
        };

        System.out.println("\nDistribuição dos salários:");
        for (int i = 0; i < faixas.length; i++) {
            System.out.println(intervalos[i] + ": " + faixas[i] + " vendedor(es)");
        }

        sc.close();
    }
}
