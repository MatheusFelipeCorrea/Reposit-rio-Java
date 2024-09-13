import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;


    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    public boolean removerConta(String Nconta){
        Conta conta = buscarConta(Nconta);
        if(conta != null){
            contas.remove(conta);
            return true;
        }else {
            return false;
        }
    }
    public Conta buscarConta(String Nconta){
        for(Conta conta : contas){
            if(conta.getNconta()== Nconta){
                return conta;
            }
        }
        return null;
    }

    public void listarContas(){
        for(Conta conta : contas){
            System.out.println("Conta: "+ conta.getNconta() + " CPF: " + conta.getCPF() + " Saldo: " + conta.getSaldo());
        }
    }

    public boolean sacar(String Nconta, double valor){
        Conta conta = buscarConta(Nconta);
        if(conta != null){
            return conta.sacar(valor);
        }else{
            return false;
        }
    }

    public void depositar(String Nconta, double valor){
        Conta conta = buscarConta(Nconta);
        if(conta != null){
            conta.depositar(valor);
        }else{
            System.out.println("Conta não encontrada");
        }
    }
}
