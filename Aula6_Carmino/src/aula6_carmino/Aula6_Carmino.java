package aula6_carmino;

import java.util.Scanner;

public class Aula6_Carmino {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num1,num2,num3;
        
        System.out.print("Digite o primeiro numero: ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = ler.nextInt();
        System.out.print("Digite o terceiro numero: ");
        num3 = ler.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println("O maior numero e: " + num1);
        }else if (num2 > num3){
            System.out.println("O maior numero e: " + num2);     
        }else{
            System.out.println("O maior numero e: " + num3);
        }
                
        System.out.println((num1 > num2 && num1 > num3)
                ?"O maior numero e: " + num1
                :(num2 > num3 ?"O maior numero e: " + num2 
                :"O maior numero e: " + num3));
    
        ler.close();
    }
}
