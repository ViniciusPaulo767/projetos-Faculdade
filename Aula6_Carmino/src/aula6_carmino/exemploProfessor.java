package aula6_carmino;

import java.util.Scanner;

public class exemploProfessor {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in); 

        double a; 

        double b; 

        double c; 

        System.out.print("digite um valor: "); 

        a = entrada.nextDouble(); 

        System.out.print("digite outro valor: "); 

        b = entrada.nextDouble(); 

        System.out.print("digite mais um valor: "); 

        c = entrada.nextDouble(); 

        if (a > b && a > c) { 

            System.out.println(a + " e o maior valor entre os valores postos"); 

        } else if (b > a && b > c) { 

            System.out.println(b + " e o maior valor entres os valores postos"); 

        } else if (c > a && c > b) { 

            System.out.println(c + " e o maior valor posto entre os valores postos"); 

        } 

    } 

}

