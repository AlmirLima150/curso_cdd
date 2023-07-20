package javaFuncoes;
import java.util.StringTokenizer;

public class exercicio_26 {
    public static void main(String[] args) {

        //Conta a quantidade de palavras de uma String, mais temos que importar o "StringTokenizer".
        
        StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
        System.out.println(exemplo.countTokens());
    }
}
