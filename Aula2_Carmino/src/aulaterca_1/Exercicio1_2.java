package aulaterca_1;

import java.util.Scanner;

public class Exercicio1_2 {

    public static void main(String[] args) {
        double valorCompra =0;
        Scanner ler = new Scanner(System.in);
        valorCompra=ler.nextDouble();
        if(valorCompra>=200){
            System.out.println("Valor com Desconto:" + (valorCompra - valorCompra*10/100));
        }else{
            System.out.println("Valor da Compra:" + valorCompra);
        }
        ler.close();
        
    }
    
}