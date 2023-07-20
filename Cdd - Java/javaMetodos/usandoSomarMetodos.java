package javaMetodos;

public class usandoSomarMetodos {
    public static void main(String[] args) {
        somarMetodos exemplo = new somarMetodos();
        int somar1 = exemplo.somar(30, 15);
        int somar2 = exemplo.somar(30, 15, 25);
        double media1 = exemplo.media(somar1, somar2);
        double media2 = exemplo.media(somar1, somar2, media1);
        System.out.println(somar1);
        System.out.println(somar2);
        System.out.println(media1);
        System.out.println(media2);

    }
}
