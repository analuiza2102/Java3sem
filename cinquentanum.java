import java.util.Scanner;

public class cinquentanum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //Cria um scanner para ler a entrada do user; 
        
        System.out.print("Digite um número inteiro: ");

        int numero = scanner.nextInt(); //Int é o inteiro que vai ser digitado, numero é o nome da variável que uso para armazenar o valor digitado, scanner é o le o que foi digitado, nextInt le e armazena o valor.

        System.out.println("Número atual: " + numero);


        System.out.println("Os 50 números anteriores a " + numero + " são:"); //Imprime a mensagem com o número digitado pelo user; 

        for (int i = numero - 1; i >= numero - 50; i--) { 
            System.out.println(i);
        }

        System.out.println("Os 50 números posteriores a " + numero + " são:");

            for (int i = numero + 1; i <= numero + 50; i++) { //for cria um loop de repetição, j é a variável que vai ser usada para armazenar o valor do número, numero + 1 é o valor inicial do loop, j <= "menor ou igual a" numero + 50 é a condição para o loop continuar, j++ é o incremento do loop;
            
            System.out.println(i); 

            }

            scanner.close(); //Fecha o scanner para liberar memória;
    }
}

