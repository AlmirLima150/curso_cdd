package javaFuncoes;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int i = 0;

        System.out.println("Digite um numero inteiro");
        numero = scan.nextInt();

        while (i < numero) {
            i++;
            if(i % 2 == 0){
                System.out.println(i + " é par");
                continue;
            }
            System.out.println(i + " é inpar");
        }

    }
}
