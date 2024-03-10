/*- < - menor que
- > - maior que */

import java.util.Scanner;
 
public class decimaismenor { //Cria classe decimaismenor
     public static void main(String[] args) { // Método main que executa o programa
        Scanner sc = null; // Cria o objeto scanner
 
        double n1 = 0, n2 = 0, n3 = 0; // Declaração de variáveis do tipo double

        try { // Tenta executar o bloco de código, try é usado para capturar exceções como entrada inválida ou divisão por zero
            sc = new Scanner(System.in);  // Cria o objeto scanner

            // Loop para garantir entradas válidas
            while (true) { // Loop infinito
                System.out.println("Digite o primeiro número: "); // Imprime na tela
                if (sc.hasNextDouble()) { // Se a entrada for um número
                    n1 = sc.nextDouble(); // Lê o número digitado n1 e armazena na variável
                    break;  // Sai do loop se a entrada for válida
                } else {
                    System.out.println("Entrada inválida. Tente novamente.");
                    sc.next();  // Limpa o buffer de entrada
                }
            }

            // Loop para garantir entradas válidas
            while (true) {
                System.out.println("Digite o segundo número: ");
                if (sc.hasNextDouble()) {
                    n2 = sc.nextDouble();
                    break;  // Sai do loop se a entrada for válida
                } else {
                    System.out.println("Entrada inválida. Tente novamente.");
                    sc.next();  // Limpa o buffer de entrada
                }
            }

            // Loop para garantir entradas válidas
            while (true) {
                System.out.println("Digite o terceiro número: ");
                if (sc.hasNextDouble()) {
                    n3 = sc.nextDouble();
                    break;  // Sai do loop se a entrada for válida
                } else {
                    System.out.println("Entrada inválida. Tente novamente.");
                    sc.next();  // Limpa o buffer de entrada
                }
            }

            if (n1 < n2 && n1 < n3) { // Se n1 for menor que n2 e n3
                System.out.println("O menor número é: " + n1);
            } else if (n2 < n1 && n2 < n3) {
                System.out.println("O menor número é: " + n2);
            } else {
                System.out.println("O menor número é: " + n3);
            }
        } finally { // Bloco finally sempre é executado, independente se houve exceção ou não
            if (sc != null) { // Se o objeto scanner foi instanciado
                sc.close(); // Fecha o objeto scanner
            }
        }
    }
}
