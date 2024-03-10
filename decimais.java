import java.util.Scanner;

 public class decimais { //Cria classe decimais
        public static void main(String[] args) { // Método main que executa o programa
            Scanner sc = new Scanner(System.in); // Cria o objeto scanner

        try { // Tenta executar o bloco de código, try é usado para capturar exceções

                double n1, n2, n3; // Declaração de variáveis do tipo double
                System.out.println("Digite o primeiro número: "); // Imprime na tela

                n1 = sc.nextDouble(); // Lê o número digitado n1 e armazena na variável
                System.out.println("Digite o segundo número: "); // Imprime na tela

                n2 = sc.nextDouble(); // Lê o número digitado n2 e armazena na variável
                System.out.println("Digite o terceiro número: "); // Imprime na tela

                n3 = sc.nextDouble(); // Lê o número digitado n3 e armazena na variável

            if (n1 > n2 && n1 > n3) { // Se n1 for maior que n2 e n3
                    System.out.println("O maior número é: " + n1); // Imprime na tela
                } else if (n2 > n1 && n2 > n3) { // Se n2 for maior que n1 e n3
                    System.out.println("O maior número é: " + n2); // Imprime na tela
                } else {    // Se n3 for maior que n1 e n2
                    System.out.println("O maior número é: " + n3); // Imprime na tela
            }
            
            } finally { // Bloco finally sempre é executado, independente se houve exceção ou não
                sc.close(); // Fecha o objeto scanner
        }
    }
 }

