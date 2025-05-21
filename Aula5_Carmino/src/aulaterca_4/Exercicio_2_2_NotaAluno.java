
package aulaterca_4;

import java.util.Scanner;

public class Exercicio_2_2_NotaAluno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nota;
        
        System.out.print("Digite sua nota: ");
        nota = ler.nextInt();
        
        if(nota < 5){
            System.out.println("Reprovado");
        }else if (nota > 5 && nota < 6.9){
            System.out.println("Recuperacao");
        }else {
            System.out.println("Aprovado");
        }
        System.out.println(
                nota < 5 ? "Reprovado" : 
                (nota > 5 && nota < 6.9 ? "Recuperacao" : "Aprovado"));
    }
    
}
