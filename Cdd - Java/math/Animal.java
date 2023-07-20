package math;

public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void andar(){
        System.out.println("O animal está andando");
    }

    public void emitirSom(){
        System.out.println("O animal está emitindo som");
    }

    public void nomeAnimal(){
        System.out.println("O nome do animal é " + nome);
    }
}
