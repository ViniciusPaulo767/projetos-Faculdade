package Heranca;
public class professor extends funcionario {
    String titulacao, disciplina;
    
    void exibirProfessor(){
    System.out.println("Titulacao e = " + titulacao);
    System.out.println("Disciplina e = " + disciplina);
    }
    
    void ensinar(){
    System.out.println("Ensinar Phyton");
    }
}
