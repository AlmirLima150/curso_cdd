package javaFuncoes;


import java.util.Scanner;

public class exercicio_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char resposta;
		String interrogatorio;
		int cont = 0;
		
        System.out.println("Responda [S] para sim ou [N]  para n");
		System.out.println("Telefonou para a vítima? ");
		resposta = scan.next().charAt(0);
		if(resposta == 's') {
			cont+=1;
		}
		System.out.println("Esteve no local do crime? ");
		resposta = scan.next().charAt(0);
		if(resposta == 's') {
			cont+=1;
		}
		System.out.println("Mora perto da vítima? ");
		resposta = scan.next().charAt(0);
		if(resposta == 's') {
			cont+=1;
		}
		System.out.println("Devia pra vítima? ");
		resposta = scan.next().charAt(0);
		if(resposta == 's') {
			cont+=1;
		}
		System.out.println("Já trabalhou com a vítima? ");
		resposta = scan.next().charAt(0);
		if(resposta == 's') {
			cont+=1;
		}
		
		if(cont == 2) {
			System.out.println("Essa pessoa é suspeita");
		}
		else if(cont >=3 && cont <= 4) {
			System.out.println("Essa pessoa foi cúmplice");
		}
		else if(cont == 5) {
			System.out.println("Essa pessoa é o assassino");
		}else {
			System.out.println("Essa pessoa é inocente");
		}
	}

	
	}

