package aulaterca_2;

import java.util.Scanner;

public class Exercicio_2_IMC {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso, altura, imc;
        
        System.out.print("Quantos voce pesa: ");
        peso = ler.nextDouble();
        
        System.out.print("Qual sua altura: ");
        altura = ler.nextDouble();
        //O calculo tem ser feito depois de o usuario colocar o peso e altura.
        imc = peso /(altura*altura);
        
        if (imc < 18.5){
            System.out.println("Voce esta abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Voce esta com peso normal");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Voce esta com sobrepeso");
        } else{
            System.out.println("Voce esta com obesidade");
        }
        ler.close();
                
    }
    
}
