package menbros;

public class UsoMembros {
    public static void main(String[] args) {
        DataNascimento dt = new DataNascimento();
        DataNascimento dt2 = new DataNascimento();

        dt.dia = 12;
        dt.mes = 02;
        dt.ano = 1991;

        dt2.dia = 02;
        dt2.mes = 04;
        dt2.ano = 2000;

        System.out.printf("A data de nascimento " + "é %d %d %d \n ", dt.dia, dt.mes,dt.ano);
        System.out.printf("A data de nascimento " + "é %d %d %d \n ", dt2.dia, dt2.mes,dt2.ano);
    }
}
