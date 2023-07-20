package javaFuncoes;
import java.util.Scanner;

public class exercicio_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double array[] = new double[5];
        double soma = 0;
        double media= 0;
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Digite a nota do " + (i+1) + "º aluno: ");
            array[i] = scan.nextDouble();
        }
        for (int x = 0; x < array.length; x++) {
            soma += array[x];
        }

        media = soma / array.length;
        System.out.printf("A media da turma é " + media);
    }
}
