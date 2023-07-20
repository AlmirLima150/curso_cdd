package javaMetodos;

public class usandoMetodos {
    public static void main(String[] args) {
        metodos pessoa = new metodos();
        
        String nome = pessoa.nome();
        int idade = pessoa.idade();
        double valor = pessoa.valor();
        boolean estado = pessoa.estado();
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(valor);
        System.out.println(estado);
}
}
