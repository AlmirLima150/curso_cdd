package math;

public class Calculadora {
    public static void main(String[] args) {
        Operacoes op1 = new Operacoes();

        Operacoes op2 = new Operacoes(2, 5);

        Operacoes op3 = new Operacoes(1, 2, 3);

        op1.somar(2,5);
        op2.somar(5,5);
        op3.somar(2,5,8);
    }
}
