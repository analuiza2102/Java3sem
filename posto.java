import java.util.Scanner;

public class posto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços por litro
        double precoGasolina = 5.35;
        double precoEtanol = 3.79;

        // Leitura do número de litros e tipo de combustível
        System.out.print("Digite o número de litros vendidos: ");
        double litros = scanner.nextDouble();

        System.out.print("Digite o tipo de combustível (E para Etanol, G para Gasolina): ");
        char tipoCombustivel = scanner.next().toUpperCase().charAt(0);

        // Cálculo do valor a ser pago
        double valorPagar = calcularValorPagar(litros, tipoCombustivel, precoEtanol, precoGasolina);

        // Impressão do resultado em tabela
        System.out.println("\n===== Detalhes da Transação =====");
        System.out.printf("| %-20s | %-10s |\n", "Descrição", "Valor");
        System.out.println("|----------------------|------------|");
        System.out.printf("| %-20s | R$ %.2f   |\n", "Preço por Litro", (tipoCombustivel == 'E') ? precoEtanol : precoGasolina);
        System.out.printf("| %-20s | %.2f L      |\n", "Litros Vendidos", litros);
        System.out.printf("| %-20s | R$ %.2f   |\n", "Total (Sem Desconto)", litros * (tipoCombustivel == 'E' ? precoEtanol : precoGasolina));
        System.out.printf("| %-20s | R$ %.2f   |\n", "Desconto Aplicado", litros * (tipoCombustivel == 'E' ? precoEtanol : precoGasolina) - valorPagar);
        System.out.printf("| %-20s | R$ %.2f   |\n", "Valor a Pagar", valorPagar);
        System.out.println("|----------------------|------------|");

        scanner.close();
    }

    // Método para calcular o valor a ser pago, considerando os descontos
    private static double calcularValorPagar(double litros, char tipoCombustivel, double precoEtanol, double precoGasolina) {
        double precoLitro = (tipoCombustivel == 'E') ? precoEtanol : precoGasolina;
        double precoTotal = litros * precoLitro;

        // Aplica os descontos conforme a tabela
        if (litros <= 20) {
            if (tipoCombustivel == 'E') {
                precoTotal *= 0.97; // Desconto de 3% no Etanol
            } else {
                precoTotal *= 0.94; // Desconto de 6% na Gasolina
            }
        } else {
            if (tipoCombustivel == 'E') {
                precoTotal *= 0.95; // Desconto de 5% no Etanol
            } else {
                precoTotal *= 0.96; // Desconto de 4% na Gasolina
            }
        }

        return precoTotal;
    }
}
