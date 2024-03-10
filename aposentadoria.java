import java.util.Scanner;
import java.time.LocalDate;

public class aposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das informações
        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso na empresa do empregado: ");
        int anoIngresso = scanner.nextInt();

        // Cálculo da idade e tempo de trabalho
        int idade = calcularIdade(anoNascimento);
        int tempoTrabalho = LocalDate.now().getYear() - anoIngresso;

        // Verificação da aposentadoria
        if ((idade >= 65 && tempoTrabalho >= 30) || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer aposentadoria");
        }

        // Impressão das informações
        System.out.println("Número do empregado: " + codigoEmpregado);
        System.out.println("Idade do empregado: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        scanner.close();
    }

    // Método para calcular a idade com base no ano de nascimento
    private static int calcularIdade(int anoNascimento) {
        return LocalDate.now().getYear() - anoNascimento;
    }
}
