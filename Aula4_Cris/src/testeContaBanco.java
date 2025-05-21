public class testeContaBanco {
    public static void main(String[] args) {
        contaBanco cb1 = new contaBanco();
        
        cb1.numeroConta = 586116;
        cb1.saldo = 2000.0;
        cb1.limite = 1000.0;
        cb1.valorMais = 100;
        cb1.valorMenos = 200;
        
        cb1.consultarSaldo();
        cb1.imprimirExtrato();
        cb1.fazerDeposito();
        cb1.fazerSaque();
    }
}
