package javaFuncoes;
import java.util.Scanner;

public class exercicio_30 {
    public static void main(String[] args) {
        
        //O toUpperCase() serve para colocar toda String em Maiusculo e o toLowerCase serva para deixa las em minusculo. 

        Scanner scan = new Scanner(System.in);
        String texto;
        
        System.out.print("Digite um texto: ");
        texto = scan.nextLine();

        System.out.println(texto.toUpperCase());
    }
}
