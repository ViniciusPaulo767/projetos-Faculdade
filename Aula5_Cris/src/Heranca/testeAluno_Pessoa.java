package Heranca;
public class testeAluno_Pessoa {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        aluno a1 = new aluno();
        
        p1.nome = "Vinicius";
        p1.idade = 21;
        
        a1.nome = "Vinicius";
        a1.idade = 21;
        a1.numeroMatricula = 825162323;
        a1.curso = "Analise e Desenvolvimento de Sistemas";
        a1.disciplina = "Programacao Orientada a Objetos";
        a1.nota1 = 8;
        a1.nota2 = 5;
        
        p1.exibirDados();
        a1.exibirDados();
        a1.exibirAluno();
        a1.calcularMedia();
    }
}
