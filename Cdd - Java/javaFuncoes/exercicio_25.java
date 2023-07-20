package javaFuncoes;
public class exercicio_25 {
    public static void main(String[] args) {
        
        //O endsWith serve para verificar se a String termina com a palavra proposta.
        //Já o startsWith verifica se a String começa com a palavra proposta.

        String valor = "CDD - Java";

        System.out.println(valor.endsWith("Java"));
        System.out.println(valor.startsWith("C"));
        System.out.println(valor.startsWith("DD", 1));
    }
}
