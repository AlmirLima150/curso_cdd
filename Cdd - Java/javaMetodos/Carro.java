package javaMetodos;

public class Carro {
    private String cor;
    private double preco;
    private String modelo;

    public Carro(){

    }
    public Carro(String modelo, double preco){
        this.cor = "Preto";
        this.preco = 50000;
        this.modelo = "Fiat Uno";
    }
    public Carro(String modelo, String cor, double preco){
        this.cor = "Preto";
        this.preco = 50000;
        this.modelo = "Fiat Uno";    
    }
}
