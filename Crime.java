import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (sim/não): ");
            String resposta = sc.next().toLowerCase();

            if (resposta.equals("sim")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("\nClassificação: Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("\nClassificação: Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("\nClassificação: Assassino");
        } else {
            System.out.println("\nClassificação: Inocente");
        }

        sc.close();
    }
}
