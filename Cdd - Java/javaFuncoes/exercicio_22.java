package javaFuncoes;
public class exercicio_22 {
    public static void main(String[] args) {
        String str= "hello";
        String resultado = str.replace("l", "w");
        System.out.println(resultado);
        System.out.println(str);
    
        System.out.println(" ");
        
        String str1 = "Hello world";
        String resultado1 = str1.substring(3,8);
        System.out.println(str1);
        System.out.println(resultado1);
        
        System.out.println(" ");
        
        String str2 = "   Hello";
        String resultado2 = str.trim();
        System.out.println(str2);
        System.out.println(resultado2);
        
        System.out.println(" ");
        
        String str3 = "Hello";
        char resultado3 = str.charAt(1);
        System.out.println(str3);
        System.out.println(resultado3);
        
        System.out.println(" ");
        
        String s1 = "Hello";
        String s2 = "HELLO";
        boolean b1 = s1.equals("Hello");
        boolean b2 = s1.equals(s2);
        boolean b3 = s1.equalsIgnoreCase(s2);
        boolean b4 = s1.equalsIgnoreCase("Azul");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        
        System.out.println(" ");
        
        String str4 = "Hello world world2";
        int pos = str4.indexOf("l");
        
        System.out.println(pos);
        
        System.out.println(" ");
        
        String str5 = "Hello world world2";
        int pos1 = str5.lastIndexOf("l");
        
        System.out.println(pos1);
    
    }





}
