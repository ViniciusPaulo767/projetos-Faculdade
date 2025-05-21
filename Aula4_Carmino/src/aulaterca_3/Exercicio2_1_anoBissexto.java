package aulaterca_3;

import java.util.Scanner;

public class Exercicio2_1_anoBissexto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano;
        
        
        System.out.print("Digite o ano para verificacao: ");
        ano = ler.nextInt();
        
        if ((ano % 4 == 0 && ano % 100 != 0)|| ano % 400 == 0){
            System.out.println("Esse ano e bissexto");
        }else {
            System.out.println("Esse ano e normal");
        }
        System.out.println(((ano % 4 == 0 && ano % 100 != 0)|| ano % 400 == 0)? "Ano bissexto" : "Ano normal");
    }
    
}
