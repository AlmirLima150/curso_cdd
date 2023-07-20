package math;

public class Fazenda {
    public static void main(String[] args) {
        
        Animal a1 = new Animal("Muh", 8);
        Animal a2 = new Animal("Carolina", 8);
        Gato g1 = new Gato("Yumi", 5);
        Cachorro c1 = new Cachorro("Nasus", 7);
        Jacare j1 = new Jacare("Renekton", 12);
        Ave aa1 = new Ave("Azir", 6);
        c1.emitirSom();
        c1.nomeAnimal();
        g1.emitirSom();   
        aa1.emitirSom();
        aa1.andar();
    }
}
