package javaFuncoes;
import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        StringTokenizer exemplo = new StringTokenizer(scan.nextLine());
        System.out.println("A quantidade de palavras é: " + exemplo.countTokens());
        

    }
}

