package javaFuncoes;
public class exercicio_17 {
    public static void main(String[] args) {
        int soma3 = 0;
        int soma5 = 0;
        int somaTotal;
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0){
                soma3 += i;
            }
            if (i%5 ==0) {
                soma5 += i;
            }
        }
        somaTotal = soma3 + soma5;
        System.out.println("A soma dos multiplos de 3 é " + soma3);
        System.out.println("A soma dos multiplos de 5 é " + soma5);
        System.out.println("A soma total é " + somaTotal);
        
    }
}
