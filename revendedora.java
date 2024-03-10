
import java.util.Scanner;

public class revendedora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das informações
        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total de vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();

        // Cálculo do salário final
        double comissao = 0.05 * valorTotalVendas;
        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarro) + comissao;

        // Impressão do resultado
        System.out.println("Salário Final do Vendedor: R$" + salarioFinal);

        scanner.close();
    }
}

