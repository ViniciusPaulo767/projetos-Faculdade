package Heranca;

public class testeFuncionario {
    public static void main(String[] args) {
        
        funcionario f1 = new funcionario();
        gerente g1 = new gerente();
        secretaria s1 = new secretaria();
        professor p1 = new professor();
        
            f1.nome = "Vinicius";
            f1.endereco = "Rua Paulo Verissimo da Silva, 06";
            f1.salario = 2500.00;
            
            g1.nome = "Glaubert";
            g1.endereco = "Rua do Orfanato, 367";
            g1.salario = 5000.00;
            g1.departamento = "Resturante";
            g1.usuario = "glau123@gmail.com";
            g1.senha = "Gustavo123#";
            
            s1.nome = "Thamires";
            s1.endereco = "Baia Grande, 123";
            s1.salario = 1500.00;
            s1.ramal = 01;
            s1.numeroProtocolo = 637428;
            s1.horarioDisponivel = true;
            
            p1.nome = "Cristiane";
            p1.endereco = "Rua Taquari, 361";
            p1.salario = 3000.00;
            p1.titulacao = "Professor Universitario";
            p1.disciplina = "Programacao";
            
            f1.exibirDados();
            g1.exibirDados();
            g1.exibirDadosGerencia();
            s1.exibirDados();
            s1.exibirDadosSecretaria();
            p1.exibirDados();
            p1.exibirProfessor();
            p1.ensinar();
    }
 
}
