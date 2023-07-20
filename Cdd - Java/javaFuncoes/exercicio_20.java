package javaFuncoes;
import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int array_a[] = new int[10];
        int array_b[] = new int[10];
        int array_c[] = new int[10];
        int array_d[] = new int[10];

        for (int i = 0; i < array_a.length; i ++) {
            System.out.print("Digite os 10 numeros de cada array: ");
            array_a[i] = scan.nextInt();
            System.out.println("Array A");
        }        
        for (int x = 0; x < array_b.length; x ++) {
            System.out.print("Digite os 10 numeros de cada array: ");
            array_a[x] = scan.nextInt();
            System.out.println("Array B");
        }
        for (int y = 0; y < array_c.length; y ++) {
            System.out.print("Digite os 10 numeros de cada array: ");
            array_a[y] = scan.nextInt();
            System.out.println("Array C");
        }
        for (int z = 0; z < array_d.length; z ++) {
            System.out.print("Digite os 10 numeros de cada array: ");
            array_a[z] = scan.nextInt();
            System.out.println("Array D");
        }
        System.out.println(" ");
       for (int i = 0; i < array_a.length; i++) {
            System.out.print(array_a[i]);
        }
        
        System.out.println(" ");
        for (int x = 0; x < array_b.length; x++) {
            System.out.print(array_a[x]);            
        }
        System.out.println(" ");
        for (int y = 0; y < array_d.length; y++) {
            System.out.print(array_a[y]);            
        }
        System.out.println(" ");
        for (int z = 0; z < array_d.length; z++) {
            System.out.print(array_a[z]);            
        }
        
    
    }
}
