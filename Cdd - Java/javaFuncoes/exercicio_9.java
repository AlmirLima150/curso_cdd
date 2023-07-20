package javaFuncoes;
import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int alunos;
        int cont = 0;
        double nota;
        double soma = 0;
        double media;
        
        System.out.print("Qauntos alunos tem na sala? ");
        alunos = scan.nextInt();
        System.out.println(alunos);

        while (cont < alunos) {
            System.out.print("Digite a nota de um aluno: ");
            nota = scan.nextDouble();
            soma = soma + nota;
            cont+=1;
        }
        
        media = soma / alunos;



        System.out.println("A media da turma é: " + media);
    }
}
