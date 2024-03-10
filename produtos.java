import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class produtos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista para armazenar os resultados de cada produto
        List<ResultadoProduto> resultados = new ArrayList<>();

        // Loop para permitir inserção de vários produtos
        char continuar;
        do {
            // Leitura das informações do produto
            System.out.print("Digite a descrição do produto (nome): ");
            String descricaoProduto = scanner.next(); // Usando next() para evitar problemas com espaços no nome

            System.out.print("Digite a quantidade adquirida: ");
            int quantidadeAdquirida = scanner.nextInt();

            System.out.print("Digite o preço unitário: ");
            double precoUnitario = scanner.nextDouble();

            // Cálculo do total
            double total = quantidadeAdquirida * precoUnitario;

            // Cálculo do desconto
            double desconto = calcularDesconto(quantidadeAdquirida, total);

            // Cálculo do total a pagar
            double totalPagar = total - desconto;

            // Adiciona os resultados à lista
            resultados.add(new ResultadoProduto(descricaoProduto, total, desconto, totalPagar));

            // Pergunta ao usuário se deseja continuar
            System.out.print("Deseja inserir outro produto? (S para Sim, qualquer outra tecla para Não): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        // Impressão dos resultados consolidados em uma tabela
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-15s | %-15s | %-15s |\n", "Descrição", "Total", "Desconto", "Total a pagar");
        System.out.println("------------------------------------------------------------------------");

        for (ResultadoProduto resultado : resultados) {
            System.out.printf("| %-20s | R$%-14.2f | R$%-14.2f | R$%-14.2f |\n",
                    resultado.getDescricao(), resultado.getTotal(), resultado.getDesconto(), resultado.getTotalPagar());
        }

        System.out.println("------------------------------------------------------------------------");

        scanner.close();
    }

    // Método para calcular o desconto com base na quantidade adquirida
    private static double calcularDesconto(int quantidadeAdquirida, double total) {
        double desconto;
        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (quantidadeAdquirida <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }
        return desconto;
    }
}

// Classe para armazenar os resultados de cada produto
class ResultadoProduto {
    private String descricao;
    private double total;
    private double desconto;
    private double totalPagar;

    public ResultadoProduto(String descricao, double total, double desconto, double totalPagar) {
        this.descricao = descricao;
        this.total = total;
        this.desconto = desconto;
        this.totalPagar = totalPagar;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getTotal() {
        return total;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getTotalPagar() {
        return totalPagar;
    }
}
