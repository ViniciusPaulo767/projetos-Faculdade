package Aulas;

import java.util.Scanner;

public class Aula1_3 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
            int idade;
            String nome;
            System.out.println("Digite seu nome: ");
            nome = ler.next();
            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();
            System.out.println("Seu nome ="+nome+"\n");
            System.out.println("Sua idade ="+idade);
    }
}
