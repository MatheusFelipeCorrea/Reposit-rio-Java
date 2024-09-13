public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Conta conta1 = new Conta("1234", "123456789", 1000, 1000);
        Conta conta2 = new Conta("5678", "987654321", 2000, 2000);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.listarContas();
        banco.sacar("1234", 500);
        banco.depositar("5678", 500);
        banco.listarContas();


        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        banco.listarContas();

        banco.sacar("1234", 500);
        banco.listarContas();

        banco.depositar("5678", 500);
        banco.listarContas();

        banco.removerConta("1234");
        banco.listarContas();
    }
}
