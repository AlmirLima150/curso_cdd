package math;

public class Gato extends Animal {
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    public void emitirSom(){
        System.out.printf("%s está miando\n", nome);
    }
}
