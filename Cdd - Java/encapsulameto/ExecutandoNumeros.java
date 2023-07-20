package encapsulameto;

public class ExecutandoNumeros {
    public static void main(String[] args) {
        Numeros num = new Numeros();
        System.out.println(num.getNum1());
        num.setNum1(50);
        System.out.println(num.getNum1()); 

    }
}
