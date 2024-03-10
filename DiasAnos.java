import java.util.Scanner;

public class DiasAnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int idadeEmAnos = scanner.nextInt();

        int diasTotais = idadeEmAnos * 365;
        int meses = diasTotais / 30;
        int diasRestantes = diasTotais % 30;

        System.out.println("Idade convertida: " + diasTotais + " dias, " + meses + " meses e " + diasRestantes + " dias.");

        scanner.close();
    }
}
