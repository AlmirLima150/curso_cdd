package javaMetodos;

    
    public class Honda extends Carro{
        private String motor;
        public Honda(){
    
        }
    public Honda(String motor, String modelo, double preco,String cor){
        this.motor = motor;
        super(modelo,preco,cor);
        }
    }
