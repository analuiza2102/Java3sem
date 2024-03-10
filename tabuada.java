//faça um programa que imprima a tabuada do 6 (de 1 a 10).
//6 x 1 = 6
//6 x 2 = 12
//6 x 3 = 18
//...

//Quando você compila um arquivo Java usando o comando javac, o compilador Java gera um arquivo de bytecode com a extensão .class, não .java. O arquivo .class contém o código executável para a máquina virtual Java (JVM).

public class tabuada{
        public static void main(String[] args){
            int x = 6;
            for(int i = 1; i <= 10; i++){
                System.out.println(x + " x " + i + " = " + (x * i));

            }
        }
    } 

