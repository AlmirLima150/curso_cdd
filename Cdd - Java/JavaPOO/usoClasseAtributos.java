package JavaPOO;

public class usoClasseAtributos {
    public static void main(String[] args) {
        atributosClasses cliente01 = new atributosClasses();
        System.out.println(cliente01.fnome);
        System.out.println(cliente01.inome);   
        System.out.println(cliente01.idade);
        System.out.printf("O aluno %s %s tem %d anos", cliente01.fnome, cliente01.inome, cliente01.idade);   

    }
}
