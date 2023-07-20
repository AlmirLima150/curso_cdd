package javaFuncoes;
public class exercicio_23 {
    public static void main(String[] args) {
        String str = "O rato roeu a roupa do rei de Roma";
        String resultado = str.replace(" ", "");
        System.out.println("O tamanho da String é "+ str.length());
        System.out.println("O tamanho da String sem espaços é "+ resultado.length());

    }
}
