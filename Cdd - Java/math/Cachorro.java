package math;

public class Cachorro extends Animal {
    public Cachorro (String nome, int idade){
        super(nome, idade);
    }
    public void emitirSom(){
        System.out.printf("%s está latindo \n", nome);
    }
    public void andar(){
        System.out.printf("%s Está correndo \n", nome);
    }
}
