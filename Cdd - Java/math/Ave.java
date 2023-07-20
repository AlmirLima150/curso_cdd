package math;

public class Ave extends Animal {
    public Ave(String nome, int idade){
        super(nome,idade);
    } 
    public void emitirSom(){
        System.out.printf("%s está cantando \n", nome);
    }
    public void andar(){
        System.out.printf("%s Está voando \n", nome);
    }
}
