import java.util.Scanner;

public class municipio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das informações do município
        System.out.print("Digite o nome do município: ");
        String municipio = scanner.nextLine();

        System.out.print("Digite o total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos em branco: ");
        int votosBranco = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Cálculos para a tabela
        int porcentagemBranco = (votosBranco * 100) / totalEleitores;
        int porcentagemNulos = (votosNulos * 100) / totalEleitores;
        int porcentagemValidos = (votosValidos * 100) / totalEleitores;

        // Impressão da tabela
        System.out.println("Resultado da Eleição - " + municipio);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s %-15s\n", "Totais", "Quantidade", "Porcentagem", " ");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s %-15d %-15d%% %-15s\n", "Eleitores", totalEleitores, 100, " ");
        System.out.printf("%-20s %-15d %-15d%% %-15s\n", "Votos em branco", votosBranco, porcentagemBranco, " ");
        System.out.printf("%-20s %-15d %-15d%% %-15s\n", "Votos nulos", votosNulos, porcentagemNulos, " ");
        System.out.printf("%-20s %-15d %-15d%% %-15s\n", "Votos válidos", votosValidos, porcentagemValidos, " ");
        System.out.println("-----------------------------------------------------------------");

        scanner.close();
    }
}
